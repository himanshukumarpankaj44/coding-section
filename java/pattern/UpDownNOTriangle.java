package pattern;
import java.util.*;
public class UpDownNOTriangle {
    
        public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of pattern:");
          int size=sc.nextInt();
          for(int i=1;i<=size;i++){
              for(int j=size-i;j>=1;j--){
                  System.out.print("  ");
              }
              for(int j=1;j<=i*2-1;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }
          for(int i=1;i<=size;i++){
              for(int j=1;j<=i;j++){
                  System.out.print("  ");
              }
              for(int j=(2*size)-2*i-1;j>=1;j--){
                  System.out.print(j+" ");
              }
              System.out.println();
          }
          sc.close();
        } 
      }
