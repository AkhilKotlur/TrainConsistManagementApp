import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Current Consist: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());

        System.out.println("\nRemoving AC Chair bogie...");
        passengerBogies.remove("AC Chair");

        System.out.println("Does Sleeper exist in consist? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Consist: " + passengerBogies);
        System.out.println("Final Bogie Count: " + passengerBogies.size());
    }
}