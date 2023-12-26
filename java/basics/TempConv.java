import java.util.*;
public class TempConv {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temprature in celcius:");
        float cel=sc.nextInt();
        float far=(9*cel/5)+32;
        System.out.println("Temprature in farhenheit:"+far);
        sc.close();

    }
}
