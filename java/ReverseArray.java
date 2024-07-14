import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the element of the array:");
        for(int i= 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before reversing array elemenst:");
        printArray(arr,size);
        reverseArray(arr,size);
        System.out.println("After the reversing the array elements:");
        printArray(arr,size);
    }
    public static void reverseArray(int[] arr,int size){
        int first =0, last = size-1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println();
    }
}
