// java program to get factorial of a value using recursion
import java.util.*;
public class RecFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for factorial:");
        long num = sc.nextLong();
        sc.close();
        System.out.println("Factorial of value is:"+factorial(num));
    }
    
    public static long factorial(long num){

        if(num == 0){
            return 1;
        }

         return factorial(num - 1)*num;
    }
    
}
