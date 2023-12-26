
import java.util.*;
public class deciToOctal {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the decimal number to convert inot octal:");
     int num = sc.nextInt();
     int octal=0;
     int i=1;
     int temp=num;
     while(temp>0){
        octal+=(temp%8)*i;
        temp=temp/8;
        i=i*10;
     }
     System.out.println("decimal:"+num+"is to ="+octal+" octal value");
     sc.close();

     
    }
    
}
