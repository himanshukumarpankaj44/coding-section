import java.util.*;
public class Operations {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a - b;

    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static double div(int a, int b){
        return a/b;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int  a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of a and b is "+add(a,b));
        sc.close();
    }

}
