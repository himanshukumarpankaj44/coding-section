import java.util.*;
public class ArrayPractice {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[20];
      System.out.println("Enter the size of the array:");
      int size = sc.nextInt();
      System.out.println("Enter the element of the array:");
      for(int i=0; i<size;i++){
          arr[i] = sc.nextInt();
      }
      System.out.println("Here sre the elements of the array:");
      printArray(arr,size);
      System.out.println("Largest element of the array is:"+largeElement(arr,size));
      System.out.println("Smallest element of the array is :"+smallElement(arr,size));
      sc.close();
    }
  public static void printArray(int[] arr, int size){
      for(int i=0;i<size;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  public static int largeElement(int[] arr,int size){
      int large = Integer.MIN_VALUE;
      for(int i=0;i<size;i++){
          if(large<arr[i]){
              large = arr[i];
          }
      }
      return large;
  }
    public static int smallElement(int[] arr,int size){
        int small = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        return small;
    }

}
