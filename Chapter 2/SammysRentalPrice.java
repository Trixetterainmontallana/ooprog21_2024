import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        String[] sammys = {
            "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS",
            "S Sammy's makes it fun in the sun. S",
            "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS",
        };
        for (String line : sammys) {
            System.out.println(line);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the equipment you want to rent:");
System.out.println("(Rental Cost: $40 per hour plus $1 per additional minute)");
        System.out.println("1. Kayaks");
        System.out.println("2. Canoes");
        System.out.println("3. Beach Chairs");
        System.out.println("4. Umbrellas");

        System.out.print("Enter the number corresponding to your choice: ");
        int choice = scanner.nextInt();

        String equipment = "";
        switch (choice) {
            case 1:
                equipment = "Kayaks";
                break;
            case 2:
                equipment = "Canoes";
                break;
            case 3:
                equipment = "Beach Chairs";
                break;
            case 4:
                equipment = "Umbrellas";
                break;
            default:
                System.out.println("Invalid choice, please restart the program and choose a valid option.");
                return; // Exit the program if the choice is invalid.
        }

        System.out.print("Enter the total number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        int costPerHour = 40;
        int costPerMinute = 1;
        int totalCost = (hours * costPerHour) + (minutes * costPerMinute);

        System.out.println("You rented " + equipment + " for " + hours + " hour(s) and " + minutes + " minute(s).");
        System.out.println("Total rental cost: $" + totalCost);
    }
}


