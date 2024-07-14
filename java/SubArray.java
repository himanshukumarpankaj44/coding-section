import java.util.*;
public class SubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,7,21,11};
        System.out.print("Here is the all the element of the Array: [");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");

        System.out.println("Here is the all the sug array of the given array:");
        subArr(arr);

    }
    public static void subArr(int[] arr){
        int total =0,sum=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                int subSum =0;
               for(int k=i;k<=j;k++){
                   System.out.print(arr[k]+",");
                   sum+= arr[k];
                   subSum += arr[k];
               }
                System.out.print("], ");
                total++;
                if(max < subSum){
                    max = subSum;
                }
            }

            System.out.println();
        }
        System.out.println("Max subArray sum is "+max);
        System.out.println("Total number of the sub Array is:"+total);
        System.out.println("Sum of the all sub Array is :"+sum);
    }
}
