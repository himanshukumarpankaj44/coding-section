import java.util.*;
public class Bubble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array elements:");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before sorting :");
        printArray(arr);
        System.out.println("Array after the sorting:");
       // bubbleSort(arr);
       // selectionSort(arr);
        insertionSort(arr);
        printArray(arr);
        sc.close();

    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void printArray(int[] arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+",");

        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
             int minPos = i;
             for(int j=i+1; j<arr.length;j++){
                 if(arr[minPos] > arr[j]){
                     minPos= j;
                 }

             }
             int temp = arr[minPos];
             arr[minPos]= arr[i];
             arr[i]=temp;
        }
    }
    public static void  insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && curr < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
