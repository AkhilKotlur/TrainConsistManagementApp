import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");

        System.out.println("Initial Train: " + trainConsist);

        System.out.println("\nAdding Engine at the front and Guard Coach at the end...");
        trainConsist.addFirst("Engine");
        trainConsist.addLast("Guard Coach");

        System.out.println("Inserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("Current Sequence: " + trainConsist);

        System.out.println("\nDetaching Engine and Guard Coach for maintenance...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Final Bogie Count: " + trainConsist.size());
    }
}