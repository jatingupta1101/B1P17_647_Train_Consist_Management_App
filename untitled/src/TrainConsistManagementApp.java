import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // --- UC5: Preserve Insertion Order & Ensure Uniqueness (LinkedHashSet) ---
        // Modeling a train yard where bogies are attached in a specific sequence
        Set<String> trainFormation = new LinkedHashSet<>();

        // 1. Attaching bogies in a specific physical sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation (Ordered): " + trainFormation);

        // 2. Attempting to attach a duplicate bogie intentionally
        // In a real yard, you can't attach the same physical bogie twice!
        System.out.println("\nAttempting to re-attach: Sleeper...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate bogie 'Sleeper' rejected. Uniqueness maintained.");
        }

        // 3. Display the final formation
        // Notice that the order is preserved (Engine first, Guard last)
        System.out.println("\nFinal Verified Train Formation:");
        int position = 1;
        for (String bogie : trainFormation) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }

        System.out.println("\nTotal Unique Bogies in Formation: " + trainFormation.size());
    }
}