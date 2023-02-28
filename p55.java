import java.util.Scanner;

public class p55 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if (isPrime(num)) {
      System.out.println(num + " is a prime number.");
    } else if (isArmstrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is neither prime nor Armstrong.");
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isArmstrong(int num) {
    int originalNum = num;
    int result = 0;
    int n = 0;
    while (originalNum != 0) {
      originalNum /= 10;
      ++n;
    }
    originalNum = num;
    while (originalNum != 0) {
      int remainder = originalNum % 10;
      result += Math.pow(remainder, n);
      originalNum /= 10;
    }
    return (result == num);
  }
}

