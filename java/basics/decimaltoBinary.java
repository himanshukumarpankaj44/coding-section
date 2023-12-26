import java.util.*;
public class decimaltoBinary {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value in decimal:");
        int dec=sc.nextInt();
        int bin=0;
        int i=1;
        int temp=dec;
        while(temp>0){
            bin+=(temp%2)*i;
            temp/=2;
            i=i*10;

        }
        System.out.println(dec+" 's binary value is:"+bin);
        sc.close();
    }
    
}
