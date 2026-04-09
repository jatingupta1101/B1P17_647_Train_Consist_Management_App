// UC17: Sort Bogie Names using Arrays.sort()

import java.util.Arrays;

class BogieNameSorter {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogieNames) {
        // Using built-in sorting
        Arrays.sort(bogieNames);
    }

    // Utility method to print array
    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

// Main Application
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management: UC17 Demo ===\n");

        // ✅ Test Case 1: Basic Alphabetical Sorting
        String[] arr1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        System.out.print("Before Sorting: ");
        BogieNameSorter.printArray(arr1);

        BogieNameSorter.sortBogieNames(arr1);

        System.out.print("After Sorting:  ");
        BogieNameSorter.printArray(arr1);
        System.out.println();

        // ✅ Test Case 2: Unsorted Input
        String[] arr2 = {"Luxury","General","Sleeper","AC Chair"};
        BogieNameSorter.sortBogieNames(arr2);

        // ✅ Test Case 3: Already Sorted
        String[] arr3 = {"AC Chair","First Class","General"};
        BogieNameSorter.sortBogieNames(arr3);

        // ✅ Test Case 4: Duplicate Bogie Names
        String[] arr4 = {"Sleeper","AC Chair","Sleeper","General"};
        BogieNameSorter.sortBogieNames(arr4);

        // ✅ Test Case 5: Single Element
        String[] arr5 = {"Sleeper"};
        BogieNameSorter.sortBogieNames(arr5);

        System.out.println("🚀 Sorting using Arrays.sort() completed!");
    }
}
