/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayssort;

/**
 *
 * @author ASUS ROG
 */
public class ArraySSort {
   //method to perform selection sort
    public static void SS(int[] array){
   int n = array.length;
// Move the boundary of the unsorted array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
    //swap the found minimum element with the first element
     int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    //method to print the array
    public static void printArray(int[] array){
         for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(numbers);

        // Perform selection sort
        SS(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
             }
    
}
