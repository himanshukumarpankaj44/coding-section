import java.util.*;
public class Linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System .out.println("Enter the size of array range b/w 10:");
        int size = sc.nextInt();
        System.out.println("Enter the element of the array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Here are the array elements:");
        arrayPrint(arr,size);
        System.out.println("Enter the key value which you want to search in the array:");
        int key = sc.nextInt();
        if(linearSearch(arr,size,key)){
            System.out.println(key+" is present in the array list");

        }else{
            System.out.println(key+" is not present in the array:");
        }
        sc.close();
    }
    public static void arrayPrint(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static boolean linearSearch(int[] arr,int size, int key){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                return true;
            }

        }
        return false;
    }
}
