import java.util.*;
public class AddTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a and b:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("sum of two number a="+a+" and b="+b+" is :"+sum);
        sc.close();
    }
    
}
