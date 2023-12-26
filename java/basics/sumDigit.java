import java.util.*;
public class sumDigit {
    public static int DigitSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Sum of digit is:"+DigitSum(num));
        sc.close();

    }
    
}
