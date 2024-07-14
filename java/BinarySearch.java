import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {5,7,11,13,17};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key element you want to find the in the list:");
        int key = sc.nextInt();
        if(binarySearch(arr,key) == -1){
            System.out.println(key+" is not present in the list");
        } else{
           System.out.println(key+" is present in the :"+binarySearch(arr,key)+" index");
        }
        
    }
    public static int binarySearch(int[] arr,int key){
        int start = 0;
        int end=arr.length-1;

        while(start <= end){
          int  mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
