import java.util.*;
public class BinaryDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal  value to convert it to binary:");
        int decNo= sc.nextInt();
        System.out.println(decNo+" value in binary"+binary(decNo));
        System.out.println("Enter the binary value to convert it in decimal:");
        int binNo = sc.nextInt();
        System.out.println(binNo+" value in decimal"+ decimal(binNo));
    }
    public static int decimal(int n){
        int dec = 0;
        int pow = 0;
        while(n > 0){
            int lastDigit = n%10;
            dec += lastDigit * (int)Math.pow(2,pow);
            n /= 10;
            pow++;
        }
        return dec;


    }
    public static int binary(int num){
        int bin = 0;
        int i=0;
        while(num>0){
            int rem= num %2;
            bin+= rem*(int)Math.pow(10,i);
            num/=2;
            i++;

        }
        return bin;
    }
}

