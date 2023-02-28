import java.util.Scanner;

public class p61 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1 to convert octal to decimal, 2 to convert decimal to octal: ");
    int choice = sc.nextInt();
    
    if (choice == 1) {
      System.out.print("Enter an octal number: ");
      int octal = sc.nextInt();
      int decimal = 0;
      int power = 0;
      while (octal != 0) {
        decimal += (octal % 10) * Math.pow(8, power);
        octal /= 10;
        power++;
      }
      System.out.println("Decimal equivalent: " + decimal);
    } else if (choice == 2) {
      System.out.print("Enter a decimal number: ");
      int decimal = sc.nextInt();
      int octal = 0;
      int power = 1;
      while (decimal != 0) {
        octal += (decimal % 8) * power;
        decimal /= 8;
        power *= 10;
      }
      System.out.println("Octal equivalent: " + octal);
    } else {
      System.out.println("Invalid choice.");
    }
  }
}

