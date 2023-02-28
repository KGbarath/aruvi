import java.util.Scanner;

public class p45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    int count = 0;
    
    while (n != 0) {
      n /= 10;
      ++count;
    }
    
    System.out.println("Number of digits: " + count);
  }
}

