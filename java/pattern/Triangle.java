package pattern;
import java.util.*;
public class Triangle {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of pattern:");
    int size=sc.nextInt();
    for(int i=1;i<=size;i++){
        for(int j=size;j>i;j--){
           System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
   } 
}
