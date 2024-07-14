import java.util.*;
public class Increase {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of number list:");
      int num= sc.nextInt();
      Accending(num);
      sc.close();
    }
    public static void Accending(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Accending(n-1);
        System.out.print(n+"");
    }
}
