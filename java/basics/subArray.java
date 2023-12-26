import java.util.Scanner;
public class subArray {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int count=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=0;i<arr.length-1;i++){
        for(int j=i;j<arr.length-1;j++){
            count++;
        }
        
       }
       System.out.println(count);
       sc.close();
    }
}
