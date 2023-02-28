import java.util.Scanner;

public class p95 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows in the matrix: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns in the matrix: ");
    int columns = sc.nextInt();
    int[][] matrix = new int[rows][columns];
    System.out.println("Enter the elements of the matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("The transpose of the matrix is:");
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}
