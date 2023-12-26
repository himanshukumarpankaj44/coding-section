package pattern;
import java.util.*;

public class SquarePattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of pattern:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=(size*2)-(i*2);j>=1;j--)
            {
                System.out.print(i+" ");
            }
           for(int j=1;j<=i;j++){
            System.out.print(j+" ");
           }
      System.out.println();

        }
    //    // for(int i=1;i<=size;i++){
    //         for(int j=size-i;j>=1;j--){
    //             System.out.print();
    //         }
    //     }
        sc.close();
    }
    
}
