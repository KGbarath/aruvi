import java.util.Scanner;

public class p52 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    System.out.print("The factors of " + number + " are: ");
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}

