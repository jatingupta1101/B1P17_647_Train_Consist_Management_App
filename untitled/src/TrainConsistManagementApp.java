// UC20: Exception Handling During Search Operations (Fail-Fast)

class BogieSearchWithValidation {

    // Method to search bogie with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Check (Defensive Programming)
        if (bogieIds.length == 0) {
            throw new IllegalStateException("🚫 Cannot perform search: No bogies available in the train.");
        }

        // ✅ Linear Search (after validation)
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                System.out.println("✅ Bogie ID found at position: " + i);
                return true;
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

        System.out.println("=== Train Consist Management: UC20 Demo ===\n");

        // ❌ Test Case 1: Empty Array → Exception
        try {
            String[] empty = {};
            BogieSearchWithValidation.searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("⚠️ Exception Caught: " + e.getMessage());
        }

        // ✅ Test Case 2: Valid Search Allowed
        String[] arr1 = {"BG101","BG205"};
        BogieSearchWithValidation.searchBogie(arr1, "BG101");

        // ✅ Test Case 3: Bogie Found
        String[] arr2 = {"BG101","BG205","BG309"};
        BogieSearchWithValidation.searchBogie(arr2, "BG205");

        // ❌ Test Case 4: Bogie Not Found
        BogieSearchWithValidation.searchBogie(arr2, "BG999");

        // ✅ Test Case 5: Single Element
        String[] arr3 = {"BG101"};
        BogieSearchWithValidation.searchBogie(arr3, "BG101");

        System.out.println("\n🚀 Program continues safely after validation!");
    }
}