import java.util.Arrays;
import java.util.Scanner;

public class p97 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println("The sorted array in descending order is:");
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
