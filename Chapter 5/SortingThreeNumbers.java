import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int s, m, l;

        if (num1 <= num2 && num1 <= num3) {
            s = num1;
            if (num2 <= num3) {
                m = num2;
                l = num3;
            } else {
                m = num3;
                l = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            s = num2;
            if (num1 <= num3) {
                m = num1;
                l = num3;
            } else {
                m = num3;
                l = num1;
            }
        } else {
            s = num3;
            if (num1 <= num2) {
                m = num1;
                l = num2;
            } else {
                m = num2;
                l = num1;
            }
        }

        System.out.println("Order: " + s + " " + m + " " + l);

        scanner.close();
    }
}
