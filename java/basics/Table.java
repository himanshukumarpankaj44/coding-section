import java.util.*;
public class Table {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to print the table :");
        int num = sc.nextInt();
        tab(num);
        sc.close();

    }
    public static void  tab(int num){
          for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
          }
    }
}
