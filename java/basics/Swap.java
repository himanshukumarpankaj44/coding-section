import java.util.*;
public class Swap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Before swapping a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.print("After swapping a="+a+" b="+b);
        sc.close();
    }
    
}
