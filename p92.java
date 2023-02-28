import java.util.Scanner;

public class p92 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows in the matrices: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns in the matrices: ");
    int columns = sc.nextInt();
    int[][] a = new int[rows][columns];
    int[][] b = new int[rows][columns];
    int[][] c = new int[rows][columns];
    System.out.println("Enter the elements of the first matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the elements of the second matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }
    System.out.println("The result of adding the two matrices is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}

