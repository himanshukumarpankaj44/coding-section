import java.util.*;
public class OddEven {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n to check weather the number is even or odd");
       int num= sc.nextInt();
       if( oddEvnFun(num)){
           System.out.println(num+" is a even number");
       }
       else{
           System.out.println(num+" is a odd number");
       }
       sc.close();

    }
    public static boolean oddEvnFun(int num){
        if (num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
