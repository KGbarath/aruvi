import java.util.Scanner;

public class p15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the coefficients of the polynomial (space-separated): ");
    String[] input = sc.nextLine().split(" ");
    int[] coefficients = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      coefficients[i] = Integer.parseInt(input[i]);
    }
    System.out.print("Enter the value of x: ");
    int x = sc.nextInt();
    int result = 0;
    for (int i = 0; i < coefficients.length; i++) {
      result += coefficients[i] * Math.pow(x, coefficients.length - i - 1);
    }
    System.out.println("The result is: " + result);
  }
}
