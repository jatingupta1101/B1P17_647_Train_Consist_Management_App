import java.util.ArrayList;
import java.util.Comparator;
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
        // Create a List to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Adding bogies with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("--- Before Sorting ---");
        passengerBogies.forEach(System.out::println);

        // UC7 Logic: Sort by capacity (Highest to Lowest)
        passengerBogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n--- After Sorting (UC7: Comparator Logic) ---");
        passengerBogies.forEach(System.out::println);
    }
}