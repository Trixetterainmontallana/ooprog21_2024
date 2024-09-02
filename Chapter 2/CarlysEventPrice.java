import java.util.Scanner;
public class CarlysEventPrice {
    public static void main(String[] args) {
        String[] carlys = {
            "*************************************",
            "* Carly's makes the food that makes *",
            "*            it a party.            *",
            "*************************************",
        };
        for (String line : carlys) {
            System.out.println(line);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of guests attending the event (cost per person is $35): ");
        int numberOfGuests = scanner.nextInt();
        
        int pricePerPerson = 35;
        int totalPrice = numberOfGuests * pricePerPerson;

        System.out.println("Total price for the event: $" + totalPrice +" for a " + numberOfGuests +" total number of attendees");

        boolean isLargeEvent = numberOfGuests >= 50;
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}

