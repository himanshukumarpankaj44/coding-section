import java.util.*;
public class Accending {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size= sc.nextInt();
    System.out.println("Enter the element of array");
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array elements are:");
    Display(arr);
    System.out.println("After the sorting array elements are in accending order:");
    disSorting(arr);
    Display(arr);
    System.out.println("Enter the element for searching:");
    int key= sc.nextInt();
    if(Searching(arr,key)==true){
        System.out.println("Element is present in the array:");
    }
    else{
        System.out.println("Element is not present in the array:");
    }
    sc.close();
   } 
   public static void accSorting(int arr[]){
    int temp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
   }
   public static void Display(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
   public static void disSorting(int arr[]){
    int temp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
  } 
   
   public static boolean Searching(int arr[],int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return true;
        }
    }
    return false;
   }
}

