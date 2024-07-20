import java.util.*;

public class TwoMatrixSum {
    static Scanner sc = new Scanner(System.in);

    public static void matrixSum(int[][] m1, int[][] m2) {
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            int[][] sum = new int[m1.length][m1[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    sum[i][j] += m1[i][j] + m2[i][j];
                }
            }
            printMatrix(sum);
        } else {
            System.out.println("size of are not so you cant't perform matrix addition:");
        }
    }

    // this method is for output printing
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // user input function for the matrix
    public static void inputMatrix(int[][] matrix) {
        System.out.println("Enter the element of matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    // matrix multiplication method

    public static void matrixMulti(int[][] m1, int[][] m2) {

        if (m1[0].length == m2.length) {
            int[][] multi = new int[m1[0].length][m2.length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m2.length; k++) {
                        multi[i][j] += m1[i][k] * m2[k][j];
                    }
                }
                printMatrix(multi);
            }
        } else {
            System.out.println("kindly provide  the valid size  of the matrix for multiplication:");
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the size of row and column of the both matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];
        inputMatrix(m1);
        inputMatrix(m2);
        matrixSum(m1, m2);
        matrixMulti(m1, m2);

    }

}
