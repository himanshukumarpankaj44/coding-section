import java.util.*;
public class InvertedStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();
        for(int i = 0; i<size;i++){
            for(int j=size-i; j > 0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
