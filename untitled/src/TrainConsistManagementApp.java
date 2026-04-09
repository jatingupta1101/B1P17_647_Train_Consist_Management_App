// UC19: Binary Search for Bogie ID (Optimized Searching)

import java.util.Arrays;

class BogieBinarySearch {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Edge Case: Empty array
        if (bogieIds.length == 0) {
            System.out.println("❌ Bogie list is empty.");
            return false;
        }

        // Ensure array is sorted (important precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                System.out.println("✅ Bogie ID found at position: " + mid);
                return true;
            }
            else if (cmp < 0) {
                low = mid + 1; // Search right half
            }
            else {
                high = mid - 1; // Search left half
            }
        }

        // Not found
        System.out.println("❌ Bogie ID not found.");
        return false;
    }
}

// Main Application
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management: UC19 Demo ===\n");

        // ✅ Test Case 1: Bogie Found
        String[] arr1 = {"BG101","BG205","BG309","BG412","BG550"};
        BogieBinarySearch.binarySearch(arr1, "BG309");

        // ❌ Test Case 2: Bogie Not Found
        BogieBinarySearch.binarySearch(arr1, "BG999");

        // ✅ Test Case 3: First Element Match
        BogieBinarySearch.binarySearch(arr1, "BG101");

        // ✅ Test Case 4: Last Element Match
        BogieBinarySearch.binarySearch(arr1, "BG550");

        // ✅ Test Case 5: Single Element
        String[] arr2 = {"BG101"};
        BogieBinarySearch.binarySearch(arr2, "BG101");

        // ❌ Test Case 6: Empty Array
        String[] arr3 = {};
        BogieBinarySearch.binarySearch(arr3, "BG101");

        // ✅ Test Case 7: Unsorted Input Handling
        String[] arr4 = {"BG309","BG101","BG550","BG205","BG412"};
        BogieBinarySearch.binarySearch(arr4, "BG205");

        System.out.println("\n🚀 Binary Search operations completed!");
    }
}