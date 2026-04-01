import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Prepare a large dataset for meaningful benchmarking
        List<Bogie> largeTrainConsist = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeTrainConsist.add(new Bogie("Sleeper", 72));
            largeTrainConsist.add(new Bogie("AC Chair", 56));
        }

        System.out.println("--- UC13: Performance Benchmarking (10k Bogies) ---");

        // 2. Measure Loop-Based Filtering
        long startTimeLoop = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : largeTrainConsist) {
            if (b.capacity > 60) {
                filteredLoop.add(b);
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        // 3. Measure Stream-Based Filtering
        long startTimeStream = System.nanoTime();
        List<Bogie> filteredStream = largeTrainConsist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        // 4. Display Results
        System.out.println("Loop Filtering Time   : " + durationLoop + " ns");
        System.out.println("Stream Filtering Time : " + durationStream + " ns");

        if (durationLoop < durationStream) {
            System.out.println("RESULT: Loop-based processing was faster in this run.");
        } else {
            System.out.println("RESULT: Stream-based processing was faster in this run.");
        }

        // Integrity Check: Ensure both methods produced same results
        System.out.println("\nVerification: Loop found " + filteredLoop.size() + " bogies, Stream found " + filteredStream.size());
    }
}