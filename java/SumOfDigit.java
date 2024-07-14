import java.util.*;
public class SumOfDigit {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value which you want to find the sum of digit:");
          int num = sc.nextInt();
          System.out.println("Sum of the digit of "+num+" is :"+sumDigit(num));
          sc.close();
    }
    public static int sumDigit(int num){
        int sum=0;
        while(num > 0){
            int rem = num % 10;
            sum+= rem;
            num /= 10;
        }
        return sum;
    }
}
