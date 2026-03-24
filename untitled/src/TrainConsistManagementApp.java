import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // --- UC6: Map Bogie to Capacity (HashMap) ---
        // Using HashMap to store Bogie Name (Key) and Seat Capacity (Value)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 1. Using put() to associate data
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);

        System.out.println("Bogie Capacity Mapping initialized.\n");

        // 2. Displaying Capacity details using entrySet()
        // entrySet() allows us to access both the Key and the Value in one loop
        System.out.println("--- Operational Capacity Details ---");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Seating Capacity: " + entry.getValue());
        }

        // 3. Fast Lookup Example
        String searchBogie = "AC Chair";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nLookup Success: The capacity of " + searchBogie + " is " + bogieCapacityMap.get(searchBogie) + " seats.");
        }

        System.out.println("\nTotal Bogie Types Tracked: " + bogieCapacityMap.size());
    }
}