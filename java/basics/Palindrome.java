import java.util.*;
public class Palindrome {
 public static void palindromNo(int num){
    int rev=0;
    int temp=num;
    while(temp>0){
        int rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }
    if(num==rev){
        System.out.println(num+" is a palindrome number:");
    }
    else{
        System.out.println(num+" is not a palindrome number.");
    }
 }   
 public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number to check the weather the given number is palindrome or not:");
    int num=sc.nextInt();
    palindromNo(num);
    sc.close();
 }
}
