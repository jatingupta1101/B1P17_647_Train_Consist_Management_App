import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC2: List of Bogie Types
        List<String> trainConsist = new ArrayList<>();
        trainConsist.add("Sleeper");
        trainConsist.add("First Class");

        // --- UC3: Tracking Unique Bogie IDs (HashSet) ---
        Set<String> bogieIds = new HashSet<>();

        // Adding Bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Intentionally adding a duplicate ID
        System.out.println("Attempting to add duplicate ID: BG101...");
        bogieIds.add("BG101");

        // Display the Unique IDs
        System.out.println("Registered Unique Bogie IDs: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        // Business Rule Check
        if (bogieIds.size() != 4) { // We tried to add 4, but only 3 are unique
            System.out.println("Note: Duplicate IDs were automatically filtered by HashSet.");
        }
    }
}