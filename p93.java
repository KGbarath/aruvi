import java.util.Scanner;

public class p93 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows in the first matrix: ");
    int rows1 = sc.nextInt();
    System.out.print("Enter the number of columns in the first matrix: ");
    int columns1 = sc.nextInt();
    System.out.print("Enter the number of rows in the second matrix: ");
    int rows2 = sc.nextInt();
    System.out.print("Enter the number of columns in the second matrix: ");
    int columns2 = sc.nextInt();
    if (columns1 != rows2) {
      System.out.println("The matrices can't be multiplied.");
      return;
    }
    int[][] a = new int[rows1][columns1];
    int[][] b = new int[rows2][columns2];
    int[][] c = new int[rows1][columns2];
    System.out.println("Enter the elements of the first matrix:");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns1; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the elements of the second matrix:");
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < columns2; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        for (int k = 0; k < columns1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    System.out.println("The product of the two matrices is:");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}

