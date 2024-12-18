/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradetracker;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS ROG
 */
public class GradeTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // User input for grades
        System.out.println("Enter grades (enter -1 to stop):");
        while (true) {
            double grade = scanner.nextDouble();
            if (grade == -1) break;
            grades.add(grade);
        }

        // Compute average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Find highest and lowest grades
        double highest = grades.get(0);
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        // Display results
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        scanner.close();
    }
    
}
