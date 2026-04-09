// UC16: Sort Passenger Bogies by Capacity using Bubble Sort

class PassengerBogieSorter {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// Main Application
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management: UC16 Demo ===\n");

        // ✅ Test Case 1: Basic Sorting
        int[] arr1 = {72, 56, 24, 70, 60};
        System.out.print("Before Sorting: ");
        PassengerBogieSorter.printArray(arr1);

        PassengerBogieSorter.bubbleSort(arr1);

        System.out.print("After Sorting:  ");
        PassengerBogieSorter.printArray(arr1);
        System.out.println();

        // ✅ Test Case 2: Already Sorted
        int[] arr2 = {24, 56, 60, 70, 72};
        PassengerBogieSorter.bubbleSort(arr2);

        // ✅ Test Case 3: Duplicate Values
        int[] arr3 = {72, 56, 56, 24};
        PassengerBogieSorter.bubbleSort(arr3);

        // ✅ Test Case 4: Single Element
        int[] arr4 = {50};
        PassengerBogieSorter.bubbleSort(arr4);

        // ✅ Test Case 5: All Equal Values
        int[] arr5 = {40, 40, 40};
        PassengerBogieSorter.bubbleSort(arr5);

        System.out.println("🚀 Sorting completed successfully!");
    }
}