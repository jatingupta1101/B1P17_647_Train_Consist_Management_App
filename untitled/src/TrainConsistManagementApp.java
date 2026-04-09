// UC18: Linear Search for Bogie ID

class BogieSearch {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                System.out.println("✅ Bogie ID found at position: " + i);
                return true; // Early termination
            }
        }

        // If not found
        System.out.println("❌ Bogie ID not found.");
        return false;
    }
}

// Main Application
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management: UC18 Demo ===\n");

        // Sample Bogie IDs (Unsorted)
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // ✅ Test Case 1: Bogie Found
        BogieSearch.linearSearch(bogieIds, "BG309");

        // ❌ Test Case 2: Bogie Not Found
        BogieSearch.linearSearch(bogieIds, "BG999");

        // ✅ Test Case 3: First Element Match
        BogieSearch.linearSearch(bogieIds, "BG101");

        // ✅ Test Case 4: Last Element Match
        BogieSearch.linearSearch(bogieIds, "BG550");

        // ✅ Test Case 5: Single Element Array
        String[] single = {"BG101"};
        BogieSearch.linearSearch(single, "BG101");

        System.out.println("\n🚀 Search operations completed!");
    }
}