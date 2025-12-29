package org.example;

public class StudentProfile {
    public static void main(String[] args) {

        // Step 2
        int age = 12;
        double height = 1.58;
        boolean isStudent = true;


        // Step 3
        int points = 85;
        double pointsDouble = points;

        // Step 4
        double averageScore = 89.7;
        int finalScore = (int) averageScore;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student: " + isStudent);
        System.out.println("Points (int): " + points);
        System.out.println("Points (double): " + pointsDouble);
        System.out.println("Average score: " + averageScore);
        System.out.println("Final score: " + finalScore);
    }
}