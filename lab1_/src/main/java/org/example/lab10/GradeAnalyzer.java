package org.example.lab10;

import java.util.List;

public class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}

