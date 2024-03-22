import java.util.*;
public class SecondLarge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
      System.out.println("largerst element of the array is:"+Largest(arr));
      System.out.println("Second largest element in the array is"+SecondLargest(arr));
      sc.close();
    }
    public static int Largest(int arr[]){
        int larg=0;
        for(int i=0;i<arr.length;i++){
            if(larg<arr[i]){
               larg=arr[i]; 
            }
        }
     return larg;
    }
    public static int SecondLargest(int arr[]){
        int temp=0;
        int size= arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[size-2];
    }
    
}
