public class p66 {
    public static void main(String[] args) {
      int[][] a = {{1, 2, 3}, {4, 5, 6}};
      int[][] b = {{7, 8}, {9, 10}, {11, 12}};
      int[][] c = multiplyMatrices(a, b);
      printMatrix(c);
    }
    
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
      int rowsA = a.length;
      int columnsA = a[0].length;
      int rowsB = b.length;
      int columnsB = b[0].length;
      if (columnsA != rowsB) {
        throw new IllegalArgumentException("A:Rows: " + columnsA + " did not match B:Columns " + rowsB + ".");
      }
      int[][] c = new int[rowsA][columnsB];
      for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < columnsB; j++) {
          for (int k = 0; k < columnsA; k++) {
            c[i][j] += a[i][k] * b[k][j];
          }
        }
      }
      return c;
    }
    
    public static void printMatrix(int[][] matrix) {
      for (int[] row : matrix) {
        for (int item : row) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
    }
  }
  
