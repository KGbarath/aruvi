import java.util.Scanner;

public class p85 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number of times to left rotate: ");
    int rotations = sc.nextInt();
    rotations %= size;
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      result[(i + rotations) % size] = arr[i];
    }
    System.out.println("The left rotated array is:");
    for (int i = 0; i < size; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

