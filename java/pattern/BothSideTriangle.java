package pattern;
import java.util.*;
public class BothSideTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=(row*2)-2*i;j>0;j--){
                System.out.print(" ");
            }
              for(int j=1;j<=i;j++){
                System.out.print("*");
            }
          System.out.println();
        }
      sc.close();
    }
    
    }  

