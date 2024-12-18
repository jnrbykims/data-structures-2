/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearchuserinputlab;

import java.util.Scanner;
/**
 *
 * @author ASUS ROG
 */
public class LinearSearchUserInputLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the size of the array (10 to 20): ");
        int size = scanner.nextInt();
        while (size < 10 || size > 20) {
            System.out.print("Invalid size! Please enter a value between 10 and 20: ");
            size = scanner.nextInt();
        }

        // Step 2: Input array elements
        double[] array = new double[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        // Step 3: Input target value to search
        System.out.print("Enter the target value to search for: ");
        double target = scanner.nextDouble();

        // Step 4: Perform linear search
        int result = linearSearch(array, target);

        // Step 5: Display results
        if (result != -1) {
            System.out.println("Target value " + target + " found at index " + result + ".");
        } else {
            System.out.println("Target value " + target + " is not in the array.");
        }

        scanner.close();
    }

    // Linear search method
    public static int linearSearch(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index of target
            }
        }
        return -1; // Return -1 if target not found
    }
}
    
    

