import java.util.*;
public class TwoDimArraySum {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of the rows and col of the Array:");
       int row = sc.nextInt();
       int col = sc.nextInt();
       int[][] matrix = new int[row][col];
       System.out.println("Enter the element of the Array:");
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
           }
       }
       System.out.println("Here is the Element of the Array:");
       printMatrix(matrix);
       System.out.println("Sum of the Array element is:"+elementSum(matrix));
       sc.close();

   }
   public static void printMatrix(int[][] matrix){
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
   }
   public static int elementSum(int[][] matrix){
       int sum=0;
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               sum+=matrix[i][j];
           }
       }
       return sum;
   }
}
