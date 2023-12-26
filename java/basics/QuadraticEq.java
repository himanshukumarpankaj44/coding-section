import java.util.*;
public class QuadraticEq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cofficient a,b and c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=Math.pow(b,2)-(4*a*c);
        double sol1=(-b - Math.sqrt(d))/2*a;
        double sol2=(-b + Math.sqrt(d))/2*a;
        System.out.println("The quadratic equation of a,b and c is"+sol1+" and"+sol2);
        sc.close();
    }

    
}
