import java.util.Scanner;
 
class p60 {
 
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            binary = binary / 10;
            power++;
        }
        return decimal;
    }
 
    public static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        int binary = 0;
        int power = 1;
        while (decimal != 0) {
            int lastDigit = decimal % 2;
            decimal = decimal / 2;
            binary += lastDigit * power;
            power *= 10;
        }
        return binary;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert binary to decimal");
        System.out.println("Enter 2 to convert decimal to binary");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter a binary number: ");
            int binary = sc.nextInt();
            int decimal = binaryToDecimal(binary);
            System.out.println("Binary to Decimal: " + decimal);
        } else if (choice == 2) {
            System.out.println("Enter a decimal number: ");
            int decimal = sc.nextInt();
            int binary = decimalToBinary(decimal);
            System.out.println("Decimal to Binary: " + binary);
        } else {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

