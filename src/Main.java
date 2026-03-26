import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);
    }
}