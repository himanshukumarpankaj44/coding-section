import java.util.*;
public class HalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
