import java.util.*;
public class binaryTodecimal {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary value:");
        int bin= sc.nextInt();
        int dec=0;
        int i=0;
        int temp=bin;
        while(temp>0){
            dec+=(bin%10)+Math.pow(2,i);
            temp/=10;
            i++;
        }

        System.out.println(bin+" binary number value in decimal="+dec);
        sc.close();
    }
    
}
