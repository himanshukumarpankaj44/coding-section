import java.util.*;
public class BinomialCofficient {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of n and r to find the NcR value:");
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println("Binomial cofficient of the given value is:"+binomial(n,r));
        sc.close();
    }
    public static long factorial(int n){
        long f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static long binomial(int n,int r){
        long ncr =  (factorial(n))/(factorial(r)*factorial((n-r)));
        return ncr;
    }
}
