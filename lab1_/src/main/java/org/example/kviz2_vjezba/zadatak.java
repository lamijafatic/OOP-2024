/*package org.example.kviz2_vjezba;

import java.util.ArrayList;
enum mogucnosti{
    PRVA,DRUGA,TRECA
}

public class Exam{
    private String subject;
    private int maxPoints;
    private mogucnosti naziv;

    public Exam(String subject,int maxPoints,mogucnosti naziv){
        this.subject=subject;
        this.maxPoints=maxPoints;
        this.naziv=naziv;
    }

    public mogucnosti getNaziv() {
        return naziv;
    }

    public void setNaziv(mogucnosti naziv) {
        this.naziv = naziv;
    }

    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public int getMaxPoints(){
        return this.maxPoints;
    }
    public void setMaxPoints(int maxPoints){
        this.maxPoints=maxPoints;


        }
    public String getExamInfo(){
        return "Subject: "+this.subject+"\nMax points: "+this.maxPoints;
    }
    public int calculateGrade(int pointsAchieved){
        if(pointsAchieved>0.9*this.maxPoints)
            return 10;
        if(pointsAchieved<0.9*this.maxPoints && pointsAchieved>0.8*this.maxPoints)
            return 9;
        if(pointsAchieved<0.8*this.maxPoints && pointsAchieved>0.7*this.maxPoints)
            return 8;
        if(pointsAchieved<0.7*this.maxPoints && pointsAchieved>0.6*this.maxPoints)
            return 7;
        if(pointsAchieved<0.6*this.maxPoints && pointsAchieved>0.5*this.maxPoints)
            return 6;
        if(pointsAchieved<0.5*this.maxPoints)
            return 5;
    }
}
public class WrittenExam extends Exam{
    private int durationMinutes;
    private int numberOfQuestions;
    public WrittenExam(int durationMinutes,int numberOfQuestions,String subject,int maxPoints){
        super(subject,maxPoints);
        this.durationMinutes=durationMinutes;
        this.numberOfQuestions=numberOfQuestions;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    @Override
    public String getExamInfo(){
        return "Promijenjeno";
    }
}
public class Student{
    private String name;
    private String studentId;
    private ArrayList<String> ispiti;

    public Student(String name, String studentId, ArrayList<String> ispiti) {
        this.name = name;
        this.studentId = studentId;
        this.ispiti = ispiti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public ArrayList<String> getIspiti() {
        return ispiti;
    }

    public void setIspiti(ArrayList<String> ispiti) {
        this.ispiti = ispiti;
    }
    public void addExam(String exam){
        this.ispiti.add(exam);
    }
}

public class zadatak {
    public static void Main(String[] args){

    }
}*/
