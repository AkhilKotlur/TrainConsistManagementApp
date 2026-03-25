import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initializing HashMap: Key is Bogie Name (String), Value is Capacity (Integer)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Using put() to associate bogies with their specific capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 1000); // 1000kg/1 ton limit

        System.out.println("Bogie Capacity Mapping initialized.\n");

        // Iterating through the map using entrySet() to display both Key and Value
        System.out.println("--- Consist Capacity Manifest ---");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // Demonstrating fast lookup
        String searchBogie = "AC Chair";
        System.out.println("\nSearching capacity for: " + searchBogie);
        System.out.println("Capacity: " + bogieCapacityMap.get(searchBogie) + " seats.");
    }
}