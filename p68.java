import java.util.Scanner;

public class p68 {

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsInFirstMatrix = firstMatrix.length;
        int columnsInFirstMatrix = firstMatrix[0].length;
        int columnsInSecondMatrix = secondMatrix[0].length;
        int[][] product = new int[rowsInFirstMatrix][columnsInSecondMatrix];
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                for (int k = 0; k < columnsInFirstMatrix; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix:");
        int rowsInFirstMatrix = sc.nextInt();
        int columnsInFirstMatrix = sc.nextInt();
        int[][] firstMatrix = new int[rowsInFirstMatrix][columnsInFirstMatrix];
        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInFirstMatrix; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of second matrix:");
        int rowsInSecondMatrix = sc.nextInt();
        int columnsInSecondMatrix = sc.nextInt();
        if (columnsInFirstMatrix != rowsInSecondMatrix) {
            System.out.println("The matrices can't be multiplied with each other.");
            return;
        }
        int[][] secondMatrix = new int[rowsInSecondMatrix][columnsInSecondMatrix];
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < rowsInSecondMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix);
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
