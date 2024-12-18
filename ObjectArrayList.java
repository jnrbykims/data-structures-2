/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectarraylist;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double grade;

    // Constructor
    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}
/**
 *
 * @author ASUS ROG
 */
public class ObjectArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            // Add students based on user input
            System.out.println("Enter student details (ID, Name, Grade). Enter -1 as ID to stop.");
            while (true) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                if (id == -1) break;
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Grade: ");
                double grade = scanner.nextDouble();

                // Add the student object to the list
                students.add(new Student(id, name, grade));
            }

            // Print details of each student
            System.out.println("\nStudent Details:");
            if (students.isEmpty()) {
                System.out.println("No students added.");
            } else {
                for (Student student : students) {
                    student.display();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please restart the program and enter correct details.");
        } finally {
            scanner.close();
    }
    }
}
