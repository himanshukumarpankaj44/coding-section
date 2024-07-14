import java.util.*;
public class PalindromeClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check weather it is palindrome or not");
        int num = sc.nextInt();
        if(palindrome(num)){
            System.out.println("Number is palindrome");
        }
        else{

            System.out.println("not a palindrome");
        }
    }
    public static boolean palindrome(int num){
        int temp = num;
        int rem;
        int rev=0;
        while(temp >0){
            rem = temp % 10;
            rev = rev *10 + rem;
            temp/=10;
        }
        if(num == rev) {
            return true;

        }
        else {
            return false;
        }

    }
}
