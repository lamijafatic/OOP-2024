package org.example.lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

enum TaskStatus {
    TO_DO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}

public class lab3 {

    static class TaskItem {
        private int taskId;
        private String taskDescription;
        private TaskStatus taskStatus;

        public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
            this.taskId = taskId;
            this.taskDescription = taskDescription;
            this.taskStatus = taskStatus;
        }

        public int getTaskId() {
            return taskId;
        }

        public void setTaskId(int taskId) {
            this.taskId = taskId;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
        }

        public TaskStatus getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(TaskStatus taskStatus) {
            this.taskStatus = taskStatus;
        }

        public void displayTask() {
            System.out.println("Task ID: " + taskId);
            System.out.println("Description: " + taskDescription);
            System.out.println("Status: " + taskStatus);
            System.out.println("-------------------------");
        }
    }


    public static class DbConnect {
        private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/taskdb";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "0903";

        private Connection connection;

        public DbConnect() {
            try {
                connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        public List<TaskItem> fetchAllTasks() {
            List<TaskItem> tasks = new ArrayList<>();
            String query = "SELECT * FROM tasks";

            try (PreparedStatement stmt = connection.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    int taskId = rs.getInt("task_id");
                    String taskDescription = rs.getString("task_description");
                    TaskStatus taskStatus = TaskStatus.valueOf(rs.getString("task_status"));
                    tasks.add(new TaskItem(taskId, taskDescription, taskStatus));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return tasks;
        }


        public TaskItem fetchTaskById(int id) {
            String query = "SELECT * FROM tasks WHERE task_id = ?";
            TaskItem task = null;

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    int taskId = rs.getInt("task_id");
                    String taskDescription = rs.getString("task_description");
                    TaskStatus taskStatus = TaskStatus.valueOf(rs.getString("task_status"));
                    task = new TaskItem(taskId, taskDescription, taskStatus);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return task;
        }


        public void createTask(String description, TaskStatus status) {
            String query = "INSERT INTO tasks (task_description, task_status) VALUES (?, ?)";

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, description);
                stmt.setString(2, status.name());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        public void updateTaskName(int id, String newDescription) {
            String query = "UPDATE tasks SET task_description = ? WHERE task_id = ?";

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, newDescription);
                stmt.setInt(2, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        DbConnect db = new DbConnect();


        db.createTask("Start learning SQL", TaskStatus.TO_DO);


        List<TaskItem> allTasks = db.fetchAllTasks();
        System.out.println("All Tasks:");
        for (TaskItem task : allTasks) {
            task.displayTask();
        }


        TaskItem taskById = db.fetchTaskById(1);
        if (taskById != null) {
            System.out.println("Fetched Task by ID:");
            taskById.displayTask();
        } else {
            System.out.println("Task not found.");
        }


        db.updateTaskName(1, "Complete Java project");
        System.out.println("Updated Task:");
        TaskItem updatedTask = db.fetchTaskById(1);
        if (updatedTask != null) {
            updatedTask.displayTask();
        }
    }
}
