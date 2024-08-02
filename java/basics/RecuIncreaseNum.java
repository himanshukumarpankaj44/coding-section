// program to print value in increasing order using recursion
import java.util.*;
public class RecuIncreaseNum {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of value you want print in increasing oreder:");
        int num = sc.nextInt();
        sc.close();
        System.out.println("value in increasing oreder:");
        increaseNum(num);

    }

    // method for printing in increasing order:
    public static void increaseNum(int num){
       
         if(num != 1){
            //System.out.println(num);
            increaseNum(num-1);
         }
         System.out.print(num+",");
         return;
         
    }
    
}
