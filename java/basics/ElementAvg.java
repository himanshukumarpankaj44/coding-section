import java.util.*; 
public class ElementAvg {
    public static float Average(int arr[]){
          int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float avg= (float)sum/arr.length;
    return avg;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         float avg=Average(arr);
         System.out.println("average of the array elements is:"+avg);
         sc.close();

    }
    
}
