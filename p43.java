import java.util.Scanner;

public class p43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = sc.nextInt();
    System.out.println("Enter second number:");
    int num2 = sc.nextInt();

    int lcm = (num1 > num2) ? num1 : num2;

    while(true) {
      if(lcm % num1 == 0 && lcm % num2 == 0) {
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
        break;
      }
      lcm++;
    }
  }
}

