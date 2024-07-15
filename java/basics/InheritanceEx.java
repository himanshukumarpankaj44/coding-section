import java.util.*;
class InheritanceEx {
    public int sum(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    
}
class Example extends InheritanceEx{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a:");
      int a= sc.nextInt();
      System.out.println("Enter the value of b:");
      int b=sc.nextInt();
      Example e = new Example();
       System.out.println("sum of two numbers is:"+e.sum(a,b));
       sc.close();
    }
}
