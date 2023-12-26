import java.util.*;
public class Pronic {
    public static void pronicNo(int num){
        
        int flag=0;
        for(int i=1;i<num;i++){
            
            if(i*(i+1)==num){
                flag=1;
                break;
            }
            
        }
        if(flag==1){
            System.out.println(num+" is a pronic number.");
        }
        else{
                System.out.println(num+" is not a pronic number.");
            }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check weather the given number is pronic or not:");
        int num=sc.nextInt();
        pronicNo(num);
        sc.close();
    }
}
