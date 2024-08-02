// prgram to sum of n num using the recursion
import java.util.*;
public class RecSumOfNnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term you want to sum:");
        int num = sc.nextInt();
        System.out.println("Sum of numbers is:"+nNumSum(num));
        sc.close();
    }

    public static int nNumSum(int num){
         
        if(num > 0){
             return num + nNumSum(num -1);
        } 
        return num;
        
    }
    // using tail recursion
    // private static int sumHelper(int num, int acc) {
        // if (num <= 0) {
            // return acc;
        // }
        // return sumHelper(num - 1, acc + num);
    // }

    // public static int sum(int num) {
        // return sumHelper(num, 0);
    //}
}
