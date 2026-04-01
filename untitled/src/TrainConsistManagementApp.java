import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Sample Inputs to Test
        String[] testTrainIds = {"TRN-1234", "TRN-88", "TRAIN-123", "TRN-abcd"};
        String[] testCargoCodes = {"PET-AB", "PET-bc", "GAS-12", "PET-XYZ"};

        System.out.println("--- UC11: Train ID & Cargo Code Validation ---");

        // 3. Validate Train IDs
        System.out.println("\nValidating Train IDs (Format: TRN-dddd):");
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        for (String id : testTrainIds) {
            Matcher matcher = trainPattern.matcher(id);
            printResult("Train ID", id, matcher.matches());
        }

        // 4. Validate Cargo Codes
        System.out.println("\nValidating Cargo Codes (Format: PET-AA):");
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);
        for (String code : testCargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            printResult("Cargo Code", code, matcher.matches());
        }
    }

    // Helper method to display validation status
    private static void printResult(String type, String value, boolean isValid) {
        String status = isValid ? "[VALID]" : "[INVALID]";
        System.out.printf("%-12s: %-10s %s%n", type, value, status);
    }
}