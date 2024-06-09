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
    public static void swap1(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
       System.out.println("After swapping the value: a="+x+" and b="+y); 
    }
    
}
