import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format("[%s | Cargo: %s]", type, cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsTrain = new ArrayList<>();
        goodsTrain.add(new GoodsBogie("Rectangular", "Coal"));
        goodsTrain.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsTrain.add(new GoodsBogie("Rectangular", "Grain"));
        // Uncomment the line below to trigger a safety violation
        // goodsTrain.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("--- Goods Train Composition ---");
        goodsTrain.forEach(System.out::println);

        // 2. UC12: Safety Compliance Check using allMatch()
        // Rule: If type is "Cylindrical", cargo MUST be "Petroleum"
        boolean isSafe = goodsTrain.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are always considered safe here
        });

        // 3. Display the Safety Result
        System.out.println("\n--- Safety Inspection Report ---");
        if (isSafe) {
            System.out.println("STATUS: [SAFE] - All safety constraints met. Train is cleared for departure.");
        } else {
            System.out.println("STATUS: [DANGER] - Safety violation detected! Check cylindrical bogie cargo.");
        }
    }
}