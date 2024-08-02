import java.util.*;
public class CompareString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str = sc.next();
        System.out.println("Enter second String:");
        String str2 = sc.next();
        if(str.equals(str2)){
            System.out.println("Both are equal");
        } else{
            System.out.println("Both are not equal");
        }
          sc.close();
    }
    
}
