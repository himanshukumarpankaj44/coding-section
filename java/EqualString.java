import java.util.*;
public class EqualString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = "himanshu";
        
        System.out.println("Enter another string to check they are equal or not:");
        String s2 = sc.next();
        if(s1.equals(s2)){
            System.out.println("Strings are equal:");
        } else{
            System.out.println("String are not equal");
        }
        s1="singh";
        System.out.println(s1);

    }
}
