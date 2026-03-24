import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (ArrayList)
        List<String> trainConsist = new ArrayList<>();

        // --- UC2: Adding Passenger Bogies ---
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies added: " + trainConsist);

        // --- UC2: Removing a Bogie ---
        // Let's simulate removing "AC Chair"
        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        // --- UC2: Checking Existence ---
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the consist.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final Consist Summary
        System.out.println("Final Bogie Count: " + trainConsist.size());
        System.out.println("Current Consist: " + trainConsist);
    }
}