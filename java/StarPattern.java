import java.util.*;
public class StarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the pattern:");
        int size = sc.nextInt();
        for(int i=0; i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
