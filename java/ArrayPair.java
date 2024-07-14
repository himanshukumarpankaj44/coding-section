import java.util.*;
public class ArrayPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,3,7};
        System.out.println("Here is the all the possible pair of the array elements:");
        arrPair(arr);
        sc.close();
    }
    public static void arrPair(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
