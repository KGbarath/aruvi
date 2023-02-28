import java.util.Scanner;

public class p62 {
  public static int binaryToDecimal(int binary) {
    int decimal = 0;
    int power = 0;
    while (binary != 0) {
      decimal += (binary % 10) * Math.pow(2, power);
      binary /= 10;
      power++;
    }
    return decimal;
  }
  
  public static int decimalToBinary(int decimal) {
    int binary = 0;
    int power = 1;
    while (decimal != 0) {
      binary += (decimal % 2) * power;
      decimal /= 2;
      power *= 10;
    }
    return binary;
  }
  
  public static int decimalToOctal(int decimal) {
    int octal = 0;
    int power = 1;
    while (decimal != 0) {
      octal += (decimal % 8) * power;
      decimal /= 8;
      power *= 10;
    }
    return octal;
  }
  
  public static int octalToDecimal(int octal) {
    int decimal = 0;
    int power = 0;
    while (octal != 0) {
      decimal += (octal % 10) * Math.pow(8, power);
      octal /= 10;
      power++;
    }
    return decimal;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1 to convert binary to octal, 2 to convert octal to binary: ");
    int choice = sc.nextInt();
    
    if (choice == 1) {
      System.out.print("Enter a binary number: ");
      int binary = sc.nextInt();
      int decimal = binaryToDecimal(binary);
      int octal = decimalToOctal(decimal);
      System.out.println("Octal equivalent: " + octal);
    } else if (choice == 2) {
      System.out.print("Enter an octal number: ");
      int octal = sc.nextInt();
      int decimal = octalToDecimal(octal);
      int binary = decimalToBinary(decimal);
      System.out.println("Binary equivalent: " + binary);
    } else {
      System.out.println("Invalid choice.");
    }
  }
}

