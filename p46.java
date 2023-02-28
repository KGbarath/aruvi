import java.util.Scanner;

public class p46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int reverse = 0;

    while (num != 0) {
      reverse = reverse * 10 + num % 10;
      num = num / 10;
    }

    System.out.println("The reverse of the number is: " + reverse);
  }
}
