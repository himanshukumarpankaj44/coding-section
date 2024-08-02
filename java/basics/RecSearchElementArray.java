// program to search an element in the array it is present or not
import java.util.*;
public class RecSearchElementArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {56,23,45,33,89,12};
        System.out.println("Enter the value for search in array:");
        int search = sc.nextInt();
          int index = searchInArray(arr, search, 0);
         if(index == -1){
            System.out.println(search+" is not in array:");
         } else{
            System.out.println(search+ " is at index "+ index+ " in the array:");
         }
         sc.close();


    }
    public static int searchInArray(int[] arr,int key,int i){
         
         if(arr.length== i){
            return -1;
         }
         if(arr[i] == key){
            return i;
         }
         return searchInArray(arr, key, i+1);
    }
    
}
