import java.util.*;
public class HollowRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the pattern:");
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(i==1 || i==size || j==1 || j==size) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
