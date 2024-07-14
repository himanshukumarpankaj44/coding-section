import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num= sc.nextInt();
        System.out.println("Reverse of the given number is"+revNum(num));
        sc.close();
    }
    public static int revNum(int num){

        int rev=0;
        while(num>0){
           int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
}

