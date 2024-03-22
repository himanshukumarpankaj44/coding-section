import java.util.*;
public class ReverseStr {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any String");
        String str=sc.next();
       System.out.println("Enter 2nd string:");
       String str2=sc.next();
      str= str.concat(str2);
     String str3="";
    int n=str.length();
    for(int i=0;i<n;i++){
         char ch=str.charAt(n-i-1);
         str3+=ch;
    }
    System.out.println("Reversed string is:"+str3);
    sc.close();
    }
      
    
}
