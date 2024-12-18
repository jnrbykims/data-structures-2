/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS ROG
 */
public class BasicArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // User input to add elements
        System.out.println("Enter numbers to add to the list (enter -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break;
            numbers.add(input);
        }

        // Print the list
        System.out.println("Original List: " + numbers);

        // Remove an element
        System.out.print("Enter index to remove: ");
        int removeIndex = scanner.nextInt();
        if (removeIndex >= 0 && removeIndex < numbers.size()) {
            numbers.remove(removeIndex);
            System.out.println("After Removal: " + numbers);
        } else {
            System.out.println("Invalid index.");
        }

        // Update an element
        System.out.print("Enter index to update: ");
        int updateIndex = scanner.nextInt();
        if (updateIndex >= 0 && updateIndex < numbers.size()) {
            System.out.print("Enter new value: ");
            int newValue = scanner.nextInt();
            numbers.set(updateIndex, newValue);
            System.out.println("After Update: " + numbers);
        } else {
            System.out.println("Invalid index.");
        }

        // Iterate and print elements
        System.out.println("Final List:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
        scanner.close();
    }
   
    
}
