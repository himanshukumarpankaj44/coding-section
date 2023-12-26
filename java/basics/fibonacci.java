import java.util.*;
public class fibonacci {
    public static void  fib(int size){
        int t1=0,t2=1;
        int t3=0;
        int sum=0;
        for(int i=0;i<size;i++){
            System.out.print(t3+" ");
            sum +=t1;
        
            t1=t2;
            t2=t3;
            t3=t1+t2;
        }
      System.out.println("Sum of fibonacci series is"+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of fibonnaci series:");
        int size=sc.nextInt();
        fib(size);
        
        sc.close();

    }
    
}
