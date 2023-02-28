import java.util.Scanner;

public class p53 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1, num2;
    char operator;

    System.out.print("Enter first number: ");
    num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    num2 = sc.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    operator = sc.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
      default:
        System.out.println("Invalid operator!");
    }
  }
}

