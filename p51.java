import java.util.Scanner;

public class p51 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the lower interval: ");
    int lower = scanner.nextInt();
    System.out.print("Enter the upper interval: ");
    int upper = scanner.nextInt();
    
    System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
    for (int i = lower; i <= upper; i++) {
      if (isArmstrong(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isArmstrong(int number) {
    int originalNumber = number;
    int result = 0;
    int n = 0;
    while (originalNumber != 0) {
      originalNumber /= 10;
      n++;
    }
    originalNumber = number;
    while (originalNumber != 0) {
      int remainder = originalNumber % 10;
      result += Math.pow(remainder, n);
      originalNumber /= 10;
    }
    return (result == number);
  }
}

