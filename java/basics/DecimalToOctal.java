import java.util.*;
public class  DecimalToOctal {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal value to convert into octal:");
        int num= sc.nextInt();
        sc.close();
        System.out.println("Here is the octal value:"+octal(num));
    }
    public  static int octal(int num){
        int temp= num;
        int oct=0;
        int i=1;
        while(temp>0){
            oct += (temp%8)*i;
            temp/=8;
            i*=10;
        }
        return oct;
    }
}
