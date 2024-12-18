/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayisort;

/**
 *
 * @author ASUS ROG
 */
public class ArrayISort {
//method to perform insection sort
    public static void IS(int[] array){
         for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements of the sorted portion of the array
            // that are greater than the key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Place the key in the correct position
            array[j + 1] = key;
        }
    }
    //Method print the array
    public static void printArray(int[]array){
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //Main Method
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(numbers);

        // Perform insertion sort
        IS(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    
    }
    
}
