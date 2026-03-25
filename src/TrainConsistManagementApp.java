import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("Attaching bogies to the engine...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Current Formation: " + trainFormation);

        System.out.println("\nAttempting to re-attach duplicate bogie: Sleeper...");
        boolean isAdded = trainFormation.add("Sleeper");

        System.out.println("Was duplicate added? " + isAdded);

        System.out.println("\nFinal Verified Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("Total Unique Bogies in Sequence: " + trainFormation.size());
    }
}