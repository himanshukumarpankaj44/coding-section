import java.util.Scanner;

public class VshapedPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattenn:");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2*(size-i);j >= 1; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=size; i++){
            for(int j=size-i+1;j>=1;j--){
                System.out.print("* ");
            }
            for(int j=1;j <=(2*i)-2; j++){
                System.out.print("  ");
            }
            for(int j=size-i+1; j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
