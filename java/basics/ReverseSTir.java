import java.util.*;
public class ReverseSTir {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sb;
        System.out.println("Enter a String which you want to reverse:");
        sb = sc.nextLine();
        System.out.println("Reverse of the String is:"+revStrings(sb));
        sc.close();
    }
    public static String revStrings(String sb){
        StringBuilder sb1 = new StringBuilder("");
        for(int i=sb.length()-1;i>=0;i--){
            sb1.append(sb.charAt(i));
        }
        return sb1.toString();
    }
}
