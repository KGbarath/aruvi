import java.util.Scanner;

public class p48 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int originalNum = num;
    int reverseNum = 0;
    while (num != 0) {
      int lastDigit = num % 10;
      reverseNum = reverseNum * 10 + lastDigit;
      num /= 10;
    }
    if (originalNum == reverseNum) {
      System.out.println(originalNum + " is a palindrome.");
    } else {
      System.out.println(originalNum + " is not a palindrome.");
    }
  }
}


