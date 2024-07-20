import java.util.*;
public class StringInsert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String str;
         System.out.println("Enter the string in which you want to perform the action:");
         str = sc.nextLine();
         System.out.println("Enter the new string which you want to insert into the and which position:");
         String str2 = sc.nextLine();
         int pos = sc.nextInt();
         System.out.println("Here is the updated string after inserting the new value:"+insertString(str, str2, pos));
         sc.close();

    }
    
    // function to insert an element at specified place:

    public static String insertString(String str, String str2, int pos){
        StringBuffer sb = new StringBuffer(str);
        sb.insert(pos, str2);
        return sb.toString();

    }
}
