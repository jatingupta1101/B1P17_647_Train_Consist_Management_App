import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class to store name and capacity
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
        // 1. Create a List to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // 2. Add bogies with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("--- Before Sorting ---");
        passengerBogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Descending: High to Low)
        passengerBogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n--- After Sorting by Capacity (High to Low) ---");
        // 4. Display sorted bogies
        passengerBogies.forEach(System.out::println);
    }
}