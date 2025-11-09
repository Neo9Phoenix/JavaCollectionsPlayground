package cop2805;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDouble {

    // Method to print each element of the list
    public static void PrintList(ArrayList<Double> list) {
        for (Double value : list) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        // Create the list and add values
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(1.5);
        numbers.add(2.35);
        numbers.add(-4.7);
        numbers.add(0.01);

        // Print original list
        System.out.println("Original List:");
        PrintList(numbers);
        System.out.println();

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted List:");
        PrintList(numbers);
        System.out.println();

        // Search for 1.5
        int index = Collections.binarySearch(numbers, 1.5);
        System.out.println("Found 1.5 at index " + index);
        
        // Fill the list with 0.0
        Collections.fill(numbers, 0.0);
        System.out.println("Zero List:");
        PrintList(numbers);
    }
}
