import java.util.*;
public class ArraysCC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[100];
      //  System.out.println("Enter the phy chem and math marks:");
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the element of the array:");
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Here are the array elements:");
        for(int i=0; i<size;i++){
            System.out.print(marks[i]+" ");
        }

//        System.out.println("phy"+marks[0]);
//        System.out.println("chem"+marks[1]);
//        System.out.println("Math"+marks[2]);
        sc.close();
    }
}
