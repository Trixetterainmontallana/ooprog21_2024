import java.util.Scanner;

public class warmup_sleepin {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Is today a weekday? (true or false): ");
        boolean weekday = scanner.nextBoolean();

        System.out.print("Are you currently on a vacation? (true or false): ");
        boolean vacation = scanner.nextBoolean();

        boolean sleepIn = sleepIn(weekday, vacation);

        if (sleepIn) {
            System.out.println("You can sleep in :D || true");
        } else {
            System.out.println("You can't sleep in :( || false");
        }

        scanner.close();
    }
}
