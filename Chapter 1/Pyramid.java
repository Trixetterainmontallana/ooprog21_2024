public class Pyramid {
    public static void main(String[] args) {
        String[] triangle = {
        "      T      ",
        "     TTT     ",
        "    TTTTT    ",
        "   TTTTTTT   ",
        "  TTTTTTTTT  ",           
        " TTTTTTTTTTT ",
        "TTTTTTTTTTTTT",     
        };

        for (String line : triangle) {
            System.out.println(line);
        }
    }
}