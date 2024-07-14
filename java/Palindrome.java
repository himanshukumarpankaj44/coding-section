import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check the number is palindrome or not:");
        int num = sc.nextInt();
        if(isPalindrome(num))
            System.out.println(num+ " is a palindrome:");
        else
            System.out.println(num+" is not a palindrome:");

    }
    public static boolean isPalindrome(int num){
          if(reverse(num)==num)
              return true;
          else
              return false;
    }
    public static int reverse(int num){
        int rev=0;
        while(num>0){
          int  rem= num%10;
           rev = rev*10 + rem;
            num/=10;

        }
        return rev;
    }
}
