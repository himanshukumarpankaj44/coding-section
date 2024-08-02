import java.util.*;
public class RecuDecreaseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to print the decrease number:");
        int num  = sc.nextInt();
        System.out.println("Number in decreasing order:");
        decreaseNum(num);
        sc.close();
    }
    public static void decreaseNum(int num){
         
        if(num == 1){
            System.out.print(num);
            return;
        }
        System.out.print(num+",");
        decreaseNum(num-1);
    }
}
