
import java.util.*;
public class octalTodecimal {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the octal value to conver into decimal:");
        int octal=sc.nextInt();
        int i=0;
        int dec=0;
        int temp=octal;
        while(temp>0){
            dec+=(temp%10)* Math.pow(8,i);
            temp/=10;
            i++;
        }
        i=1;
        System.out.println("Octal value "+octal+" in decimal is ="+dec);
        sc.close();
    }
    
}
