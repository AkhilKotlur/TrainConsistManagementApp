import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Initializing train consist...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("System ready for bogie assignment.");
    }
}