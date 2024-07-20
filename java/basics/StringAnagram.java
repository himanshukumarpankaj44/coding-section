import java.util.*;
public class StringAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two stirng which you want to they are anagram or not:");
        String str = sc.next();
        String str1 = sc.next();
        if(anagram(str, str1)){
            System.out.println("Strings are angram strings:");
        } else {
            System.out.println("String are not anagram strings:");
        }
    }
    public static boolean anagram(String str,String str1){
        if(str.length() != str1.length()){
            return false;
        } else { 
            char[] str11 = str.toLowerCase().toCharArray();
            char[] str12 = str1.toLowerCase().toCharArray();
            return str11.equals(str12);
        }
    }
}
