import java.util.Scanner;

public class p65 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = sc.nextInt();
    int[][] matrix1 = new int[rows][columns];
    int[][] matrix2 = new int[rows][columns];
    System.out.println("Enter elements of matrix 1:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter elements of matrix 2:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix2[i][j] = sc.nextInt();
      }
    }
    int[][] result = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    System.out.println("Result matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}

