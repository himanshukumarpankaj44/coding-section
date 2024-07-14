import java.util.*;
public class CharacterPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern:");
        int size = sc.nextInt();
        char ch= 'A';
        for(int i=0; i<size; i++){
            for(int j=0;j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
