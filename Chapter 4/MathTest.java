public class MathTest 
{
   public static void main(String[] args) 
   {
      double value = 37.0;
      double angleInRadians = Math.toRadians(30);
      double sqrtValue = Math.sqrt(37);
      double sinValue = Math.sin(angleInRadians);
      double cosValue = Math.cos(angleInRadians);
      double floorValue = Math.floor(22.7);
      double ceilValue = Math.ceil(22.3);
      long roundValue = Math.round(22.5);
      int maxValue = Math.max(68, 71);
      int minValue = Math.min(68, 71);
      double randomValue = Math.random() * 100;

      System.out.println("SQRT: " + sqrtValue);
      System.out.println("SIN: " + sinValue);
      System.out.println("COS: " + cosValue);
      System.out.println("FLOOR: " + floorValue);
      System.out.println("CEIL: " + ceilValue);
      System.out.println("ROUND: " + roundValue);
      System.out.println("MAX: " + maxValue);
      System.out.println("MIN: " + minValue);
      System.out.println("RANDOM: " + randomValue);
   }
}