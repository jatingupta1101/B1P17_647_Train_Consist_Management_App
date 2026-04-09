// UC15: Safe Cargo Assignment Using try-catch-finally

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// GoodsBogie Class
class GoodsBogie {

    private String shape;   // Rectangular or Cylindrical
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargoType) {
        try {
            // Validation logic
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo! Petroleum cannot be assigned to Rectangular bogie."
                );
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("✅ Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("❌ ERROR: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("ℹ️ Cargo assignment attempt completed.\n");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

// Main Application
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management: UC15 Demo ===\n");

        // ✅ Test Case 1: Safe Assignment
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        // ❌ Test Case 2: Unsafe Assignment
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        // ✅ Test Case 3: Cargo Not Assigned After Failure
        System.out.println("Cargo in bogie2: " + bogie2.getCargo()); // should be null

        // ✅ Test Case 4: Program Continues
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");

        System.out.println("🚀 Program continues after exception handling!");
    }
}