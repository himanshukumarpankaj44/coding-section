import java.util.*;
public class SpyNumb {
   public static int digitSum(int num){
    int temp=num;
    int sum=0;
    while(temp>0){
        int rem=temp%10;
        sum+=rem;
        temp/=10;
    }
    return sum;
   }
   public static int product(int num){
    int temp=num;
    int prod=1;
    while(temp>0){
      int rem=temp%10;
      prod=prod*rem;
      temp/=10;
    }
    return prod;
   }
   public static void spy(int num){
    if(digitSum(num)==product(num)){
       System.out.println(num+" is a spy number:");
    }
    else{
        System.out.println(num+" is not a spy number:");
    }
   }
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number to check weather it is spy number or not:");
    int num=sc.nextInt();
    spy(num);
    sc.close();
   }
}
