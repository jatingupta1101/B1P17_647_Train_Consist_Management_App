import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // --- UC4: Maintain Ordered Bogie IDs (LinkedList) ---
        // Using LinkedList to model the physical "chain" of a train
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Adding Bogies to the consist
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");

        // 2. addFirst() - Adding the Engine at the beginning
        trainConsist.addFirst("Engine");

        // 3. addLast() - Adding the Guard Coach at the tail
        trainConsist.addLast("Guard Coach");

        System.out.println("Initial Train Formation: " + trainConsist);

        // 4. add(index, element) - Inserting a Pantry Car at position 2
        // Position 2 means it will be: [Engine, Sleeper, PANTRY, AC Coach...]
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        // 5. removeFirst() and removeLast()
        // Simulating detaching the Engine and the Guard Coach for maintenance
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist (After detaching ends):");
        for (String bogie : trainConsist) {
            System.out.println("- " + bogie);
        }
    }
}