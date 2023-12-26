import java.util.*;
public class OddEvn{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check wether it is odd or even:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Given number is zero "+num);
        }
        else if(num%2==0){
            System.out.println("Number "+num+" is even");

        }
        else{
        System.out.println("Given number is odd "+num);

    }
    sc.close();
}
}