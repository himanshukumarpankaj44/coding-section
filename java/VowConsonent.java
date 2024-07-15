import java.util.*;
public class VowConsonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string you want to count vowel and consonent:");
        str = sc.nextLine();
        countVowConst(str);
        sc.close();
    

    }
    public static void countVowConst(String str){
        int vow=0;
        int cons=0;
        String vowels= "aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                  continue;
            }
            else if(vowels.indexOf(str.charAt(i))!= -1){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Numbers of vowels and consonent are in this strings are: vowel:"+vow+" and consonest:"+cons);
    }
    
}
