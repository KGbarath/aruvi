import java.util.Scanner;

public class p94 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Odd numbers:");
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 != 0) {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println();
    System.out.println("Even numbers:");
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        System.out.print(a[i] + " ");
      }
    }
    System.out.println();
  }
}
