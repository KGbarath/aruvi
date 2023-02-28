import java.lang.Math;

public class p14 {
   public static double cylinderArea(double radius, double height) {
      double baseArea = Math.PI * Math.pow(radius, 2);
      double lateralArea = 2 * Math.PI * radius * height;
      double totalArea = 2 * baseArea + lateralArea;
      return totalArea;
   }

   public static void main(String[] args) {
      double radius = 5;
      double height = 10;
      System.out.println("The area of a cylinder with radius " + radius + " and height " + height + " is: " + cylinderArea(radius, height));
   }
}

