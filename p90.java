import java.util.Scanner;

public class p90 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int firstSmallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int i = 0; i < size; i++) {
      if (arr[i] < firstSmallest) {
        secondSmallest = firstSmallest;
        firstSmallest = arr[i];
      } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
        secondSmallest = arr[i];
      }
    }
    System.out.println("The second smallest element in the array is: " + secondSmallest);
  }
}

