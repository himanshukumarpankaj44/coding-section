import java.util.*;
public class Neon {
    public static int square(int n){
        return n*n;
    }
    public static int digitSum(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        return sum;
    }
    public static void neonNum(int num){
        int sq=square(num);
        if(num==digitSum(sq)){
            System.out.println(num+" is a Neon number.");
        }
        else{
        System.out.println(num+" is not a Neion number.");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value to check weather given number is Neon number or not:");
        int num=sc.nextInt();
        neonNum(num);
        sc.close();
    }
}
