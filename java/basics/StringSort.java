// Java String Program to Sort a String
// Input : "software"
// Output : "aeforstw"    
import java.util.*;
public class StringSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value for sorting:");
        String str = sc.next();
        char[]  charArr = str.toCharArray();
         Arrays.sort(charArr);
         String sorted = new String(charArr);
         System.out.println("Sorted string is:"+sorted);
         sc.close();

    }
    
}
