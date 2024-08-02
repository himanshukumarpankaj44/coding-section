// Java String Program to Remove Leading Zeros
// Input: 000012356098
// Output: 12356098
// Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number.
import java.util.*; 
public class RemoveZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in which you want to remove starting zero value:");
        String input = sc.next(); 
        int val =0;
        //StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder(input);
       for(int i=0;i<input.length();i++){
         if(input.charAt(i)!= '0'){
            break;
        
         }
         val++;
       }
    //    for(int i=val;i<input.length();i++){
        //    sb.append(input.charAt(i));
    //    }
       sb.replace(0, val,"");
       
       System.out.println("Updated value is:"+ sb.toString());
       sc.close();
    }
    
}
