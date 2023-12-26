package pattern;
import java.util.*;
public class LeftTriangle {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of pattern:");
    int size =sc.nextInt();
    for(int i=1;i<=size;i++){
        
        for(int j=2*size-i;j>=1;j--){
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
