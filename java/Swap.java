import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two value which you want to swap:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Before swapping the value a ="+a+ " and b="+b);
        swapTwo(a,b);
        swapWithoutTemp(a,b);
        System.out.println("Product of two number is:"+product(a,b));
    }
    public static void swapTwo(int x,int y){
        int temp= x;
        x=y;
        y=temp;
        System.out.println("After the swapping the value: a="+x+ " and b="+y);
    }
    public static void swapWithoutTemp(int a,int b){
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println("After the swapping the value of a and b are:"+a+ " and "+b);
    }
    public static int product(int a,int b){
        return a*b;
    }
}
