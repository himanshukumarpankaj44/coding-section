import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string in which you want to perform action:");
        str = sc.nextLine();
        System.out.println("here is the String in the form of characters:");
        printLetters(str);
        System.out.println("Check that string is palindrome or not:");
        if(palindrome(str)){
            System.out.println(str+" is a palindrome:");
        } else{
            System.out.println(str+" is not a palindrome:");
        }

    }
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    public static boolean palindrome(String str){

        for(int i=0;i<str.length()/2;i++){
             if(str.charAt(i) != str.charAt(str.length()-1-i)){
                 return false;
             }
        }
        return true;
    }
}
