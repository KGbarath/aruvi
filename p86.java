import java.util.HashSet;
import java.util.Scanner;

public class p86 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    HashSet<Integer> set = new HashSet<>();
    System.out.println("Duplicate elements are: ");
    for (int i = 0; i < size; i++) {
      if (!set.add(arr[i])) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}

