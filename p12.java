import java.util.Scanner;

public class p12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of one side: ");
    double side = sc.nextDouble();
    double area = side * side;
    System.out.println("The area of the square is " + area);
  }
}
