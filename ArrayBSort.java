/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybsort;

/**
 *
 * @author ASUS ROG
 */
public class ArrayBSort {
 // Method to perform bubble sort
      public static void BS(int[] array) {
        int n = array.length;
        
        //Transverse through the array
         for (int i = 0; i < n - 1; i++) {
            // Flag to optimize and stop if no swaps are made
            boolean swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no swaps were made, the array is aleady sorted
            if (!swapped)break;
         }
      }
      
      // Method to print the array
      public static void printArray(int[] array){
           for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
      }

    /**
     * @param args the command line arguments
     */
      // Main method
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(numbers);

        // Perform bubble sort
        BS(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
    
}
