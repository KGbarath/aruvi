import java.util.Scanner;
import java.util.HashSet;

public class p91 {
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
    for (int i = 0; i < size; i++) {
      set.add(arr[i]);
    }
    int[] result = new int[set.size()];
    int index = 0;
    for (Integer i : set) {
      result[index++] = i;
    }
    System.out.println("The array after removing duplicates is:");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

