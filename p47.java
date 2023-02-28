import java.util.Scanner;

public class p47 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the base: ");
    int base = scanner.nextInt();
    
    System.out.print("Enter the exponent: ");
    int exponent = scanner.nextInt();
    
    int result = (int) Math.pow(base, exponent);
    
    System.out.println(base + "^" + exponent + " = " + result);
  }
}

