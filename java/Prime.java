import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check weather it is prime or not:");
        int n = sc.nextInt();
        if(primeNo(n)){
            System.out.println("value:"+n+" is a prime number:");

        } else{
            System.out.println("value :"+n+ "is not a prime number");

        }
        sc.close();
        System.out.println("Here is prime no. in the given range:");
        primeRange(n);

    }
    public static boolean primeNo(int num){
        if(num <= 1){
            return false;
        }
            if(num == 2){
                return true;
            }
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i==0){
                    return false;
                }
            }
            return true;

    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(primeNo(i)){
                System.out.print(i+",");
            }
        }
    }
}
