import java.util.*;
public class EvenNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        if(isEven(n))
            System.out.println("Even number");
        else
            System.out.println("Odd number:");
        sc.close();
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}