import java.util.*;
public class amiconum {
    public static void amicable(int n1,int n2){
       if(product(n1)==n2 && product(n2)==n1){
        System.out.println("pair "+n1+" and "+n2+" are amicabele pairs");
       }
       else{
        System.out.println("pair "+n1+" and "+n2+" are not a amicabele pairs:");
       }
    }
    public static int product(int num){
        int sum=0;
        for(int i=1;i<num;i++){
           if(num%i==0){
            sum=sum+i;
           }  
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value to check weather they are amicable pairs are or not:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.close();
        amicable(num1,num2);
    }
    
}
