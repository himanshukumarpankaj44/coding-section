// Java String Program to Replace a Character at a Specific Index
// Input: str = "Geeks for geeks" , index = 10 , ch = 'G'
// 
// Output: "Geeks for Geeks"
// /
import java.util.*;
public class ReplaceCharInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to perform replace method:");
        String str = sc.nextLine();
        System.out.println("enter the position where you want to replace:");
        int pos = sc.nextInt();
        System.out.println("Enter the string or character which you replace:");
        char ch = sc.next().charAt(0);
        if(pos <= 0 || pos >= str.length()){
            System.out.println("not a valid position to replace character:");
        } else 
        System.out.println("Updated string after the replacing character is:"+isReplaceChar(str, pos, ch));
        sc.close();
        
    }
    
    public static String isReplaceChar(String str, int pos, char ch){
        StringBuilder sb = new StringBuilder(str);
        
        sb.setCharAt(pos, ch);
        return sb.toString();
    }
    
}
