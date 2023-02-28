import java.util.Scanner;

public class p54 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter lower limit: ");
    int lowerLimit = sc.nextInt();
    System.out.print("Enter upper limit: ");
    int upperLimit = sc.nextInt();
    
    System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");
    printPrimeNumbers(lowerLimit, upperLimit);
  }
  
  public static void printPrimeNumbers(int lowerLimit, int upperLimit) {
    for (int i = lowerLimit; i <= upperLimit; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
  
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}

