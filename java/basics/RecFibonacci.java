// program to find the fibonacci series using recursion 
// fibonacci series 0,1,1,2,3,5,8,13
import java.util.*;
public class RecFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term for fibonacci series:");
        int term = sc.nextInt();
        System.out.println("Fibonacci nth term is::"+fibonacci(term));
        fibonacci(term);
        sc.close();
    }

    public static int fibonacci(int term){

        if(term == 0 || term == 1){
            return term;
        }
         return fibonacci(term-2) + fibonacci(term - 1);
    }
    
}
