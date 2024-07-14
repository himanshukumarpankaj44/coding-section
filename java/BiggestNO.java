import java.util.*;
public class BiggestNO {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three different value to check which one is biggest number");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        if(a==b && a==c ){
            System.out.println("All the values a="+a+"= b ="+b+" = c ="+c+" are equal");

        }else{
            System.out.println("Biggest number is"+ bigger(a,b,c));
        }

    }
    public static float bigger(float a,float b,float c){
            if (a > b && a > c) {
                return a;
            } else if (b > c) {
                return b;
            } else {
                return c;
            }
        }
}
