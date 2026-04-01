import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("[Capacity: %d]", capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a List with multiple bogies of the same type
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));

        System.out.println("--- Flat List of Bogies ---");
        trainConsist.forEach(b -> System.out.println(b.name + " " + b));

        // 2. UC9: Group bogies by their Name (Type)
        // Returns a Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 3. Display the Grouped Structure
        System.out.println("\n--- Grouped Bogies (By Category) ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " Count: " + list.size());
            System.out.println("Details: " + list);
        });

        // Verify original list integrity
        System.out.println("\n(Original list remains unchanged. Total size: " + trainConsist.size() + ")");
    }
}