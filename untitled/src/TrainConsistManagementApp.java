import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d", name, capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Setup the list of bogies
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));

        System.out.println("--- Train Composition ---");
        trainConsist.forEach(System.out::println);

        // 2. UC10: Aggregate total seats using map and reduce
        // map(b -> b.capacity) transforms Bogie objects into a stream of Integers
        // reduce(0, Integer::sum) starts at 0 and adds every value together
        int totalSeats = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\n--- Statistical Analysis (UC10) ---");
        System.out.println("Total Seating Capacity of the Train: " + totalSeats + " seats");

        // Verification: Original list remains unchanged
        System.out.println("(Processed " + trainConsist.size() + " bogies for this calculation)");
    }
}