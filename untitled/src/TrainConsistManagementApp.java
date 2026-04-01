import java.util.ArrayList;
import java.util.List;

// 1. Define the Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. Bogie class with Fail-Fast Validation
class Bogie {
    String name;
    int capacity;

    // Constructor declares it might throw our custom exception
    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid Capacity: " + capacity + ". Capacity must be greater than zero.");
        }
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
        List<Bogie> trainConsist = new ArrayList<>();

        System.out.println("--- UC14: Custom Exception Handling ---");

        // 3. Testing successful and failed creations
        int[] capacitiesToTest = {72, -10, 56, 0};
        String[] namesToTest = {"Sleeper", "Invalid_Neg", "AC Chair", "Invalid_Zero"};

        for (int i = 0; i < capacitiesToTest.length; i++) {
            try {
                Bogie newBogie = new Bogie(namesToTest[i], capacitiesToTest[i]);
                trainConsist.add(newBogie);
                System.out.println("[SUCCESS] Created: " + newBogie);
            } catch (InvalidCapacityException e) {
                System.err.println("[ERROR] Failed to create bogie '" + namesToTest[i] + "': " + e.getMessage());
            }
        }

        System.out.println("\nFinal Valid Train Consist Size: " + trainConsist.size());
    }
}