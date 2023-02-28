import java.util.Scanner;

public class p88 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number of times to right rotate: ");
    int rotations = sc.nextInt();
    rotations %= size;
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      result[(i + size - rotations) % size] = arr[i];
    }
    System.out.println("The right rotated array is:");
    for (int i = 0; i < size; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

