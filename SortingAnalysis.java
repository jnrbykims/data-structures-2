/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinganalysis;

import java.util.Random;
/**
 *
 * @author ASUS ROG
 */
public class SortingAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Step 1: Generate an array of 100 random double values
        int size = 100;
        double[] array = generateRandomArray(size);

        // Step 2: Create copies of the array for each algorithm
        double[] arrayBubble = array.clone();
        double[] arraySelection = array.clone();
        double[] arrayInsertion = array.clone();

        // Step 3: Measure and print execution times
        long bubbleTime = measureTime(() -> bubbleSort(arrayBubble));
        long selectionTime = measureTime(() -> selectionSort(arraySelection));
        long insertionTime = measureTime(() -> insertionSort(arrayInsertion));

        // Print results
        System.out.println("Execution Times (in nanoseconds):");
        System.out.println("Bubble Sort: " + bubbleTime);
        System.out.println("Selection Sort: " + selectionTime);
        System.out.println("Insertion Sort: " + insertionTime);

        // Uncomment the following lines if you want to print the sorted arrays:
        // System.out.println("\nBubble Sort Result: ");
        // printArray(arrayBubble);
        // System.out.println("\nSelection Sort Result: ");
        // printArray(arraySelection);
        // System.out.println("\nInsertion Sort Result: ");
        // printArray(arrayInsertion);
    }

    // Method to generate an array of random double values
    public static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * 100.0; // Values between 0.0 and 100.0
        }
        return array;
    }

    // Bubble Sort implementation
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort implementation
    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort implementation
    public static void insertionSort(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Measure execution time of a sorting function
    public static long measureTime(Runnable sortFunction) {
        long startTime = System.nanoTime();
        sortFunction.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Utility method to print an array
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
    
    

