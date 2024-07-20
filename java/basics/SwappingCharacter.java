import java.util.*;
//java program to swap character of a string ex: himanshu = ihamsnuh
public class SwappingCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which you want to do the character swap:");
        String str = sc.nextLine();
        System.out.println("After the swapping the value is:"+isSwapChar(str));
        sc.close();
    }

    public static String isSwapChar(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(i%2 == 0){
                char temp = str.charAt(i);
                sb.append(str.charAt(i+1));
                sb.append(temp);
                i++;
            }
        }
        return sb.toString();
    }
}
