import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        System.out.println("Registering Bogie IDs...");
        bogieIds.add("BG-101");
        bogieIds.add("BG-102");
        bogieIds.add("BG-103");

        System.out.println("Attempting to add duplicate ID: BG-101...");
        bogieIds.add("BG-101");

        System.out.println("\nRegistered Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}