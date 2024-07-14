import java.util.*;
public class Decrese {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number where into descending order:" );
        int num = sc.nextInt();
        descending(num);
         sc.close();
    }
    public static void descending(int num){
       if(num==0){
           return;
       }
       System.out.print(" "+num);

          descending(num-1);
    }
}
