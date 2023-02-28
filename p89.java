import java.util.Scanner;

public class p89 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
      if (arr[i] > firstLargest) {
        secondLargest = firstLargest;
        firstLargest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("The second largest element in the array is: " + secondLargest);
  }
}

