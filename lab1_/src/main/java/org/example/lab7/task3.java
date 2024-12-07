package org.example.lab7;

import java.util.ArrayList;
import java.util.List;
import java.time.Period;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class task3 {


    public record EmployeeRecord(String name, String position, double salary, LocalDate employmentDate) {
        public static EmployeeRecord createIntern(String name) {
            return new EmployeeRecord(name, "Intern", 30000, LocalDate.now());
        }
    }



    public static List<EmployeeRecord> filterEmployeesOverFiveYears(List<EmployeeRecord> employees) {
        return employees.stream()
                .filter(employee -> Period.between(employee.employmentDate(), LocalDate.now()).getYears() > 5)
                .collect(Collectors.toList());
    }



    public static double calculateAverageSalaryForPosition(List<EmployeeRecord> employees, String position) {
        return employees.stream()
                .filter(employee -> employee.position().equalsIgnoreCase(position))
                .mapToDouble(EmployeeRecord::salary)
                .average()
                .orElse(0.0);
    }


    public static List<EmployeeRecord> findEmployeesByPosition(List<EmployeeRecord> employees, String position) {
        return employees.stream()
                .filter(employee -> employee.position().equalsIgnoreCase(position))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<EmployeeRecord> employees = new ArrayList<>();
        employees.add(new EmployeeRecord("Alice", "Senior Developer", 95000, LocalDate.of(2015, 6, 15)));
        employees.add(new EmployeeRecord("Bob", "Junior Developer", 60000, LocalDate.of(2021, 3, 10)));
        employees.add(new EmployeeRecord("Charlie", "Senior Developer", 97000, LocalDate.of(2013, 4, 20)));
        employees.add(new EmployeeRecord("Diana", "HR Manager", 75000, LocalDate.of(2018, 11, 5)));
        employees.add(EmployeeRecord.createIntern("Eve"));


        System.out.println("Employees with over 5 years of employment:");
        filterEmployeesOverFiveYears(employees).forEach(System.out::println);

        double avgSeniorDevSalary = calculateAverageSalaryForPosition(employees, "Senior Developer");
        System.out.println("\nAverage salary for Senior Developers: $" + avgSeniorDevSalary);


        System.out.println("\nEmployees in the Senior Developer role:");
        findEmployeesByPosition(employees, "Senior Developer").forEach(System.out::println);
    }
}

