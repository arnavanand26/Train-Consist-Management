import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ---------------- UC2 START ----------------

        // Create Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies after Addition
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after Removal
        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final State
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // ---------------- UC2 END ----------------
    }
}