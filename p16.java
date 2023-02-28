import java.lang.Math;

public class p16 {
  public static void main(String[] args) {
    double outerRadius = 10.0;
    double innerRadius = 5.0;
    double area = Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);
    System.out.println("Area between the concentric circles: " + area);
  }
}

