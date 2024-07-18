import java.util.*;
public class EvenWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the value of String:");
        str = sc.nextLine();
        System.out.println("All the even words in the string:");
        evenLengthWord(str);
        System.out.println();
        evenLength2(str);
        sc.close();

    }
    public static void evenLengthWord(String str){
        // split function will split all the words 
          String[] str1 = str.split(" ");
          int[] length = new int[str1.length];
          for(int i=0;i<str1.length;i++){
             length[i] = str1[i].length();
             if(length[i]%2==0){
                System.out.print(str1[i]+" ");
             }
          }
        }
    public static void evenLength2(String str){
        // using for each loop it will iterate the object with index wise
        for (String words : str.split(" ")) {
            if(words.length()%2==0){
                System.out.print(words+" ");
            }
        }
    
    }

    
}
