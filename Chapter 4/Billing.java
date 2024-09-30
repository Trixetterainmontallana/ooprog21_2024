public class Billing {
    private static final double TAX_RATE = 0.08;

    public void computeBill(double price) {
        double total = price + (price * TAX_RATE);
        System.out.printf("The total price for the bill is: $%.2f%n", total);
    }

    public void computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * TAX_RATE);
        System.out.printf("The total price for the bill is: $%.2f%n", total);
    }

    public void computeBill(double price, int quantity, int discount) {
        double subtotal = (price * quantity);
        double total = (subtotal - discount) + ((subtotal - discount) * TAX_RATE);
        System.out.printf("The total price for the bill is: $%.2f%n", total);
    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        billing.computeBill(23.2);
        billing.computeBill(23.2, 2);
        billing.computeBill(23.2, 2, 5);
    }
}
