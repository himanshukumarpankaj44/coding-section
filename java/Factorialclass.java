import java.util.*;
public class Factorialclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value which you want to find the factorial :");
        long a = sc.nextLong();
        System.out.println("the factorial of a:"+a+ " is :"+factorial(a));

    }
    public static long factorial(long a){
        long f=1;
        for(int i=1; i<=a;i++){
            f*=i;
        }
        return f;
    }
}
