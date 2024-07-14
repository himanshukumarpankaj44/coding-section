import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b and c");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Average of three number is:"+avgThree(a,b,c));
        sc.close();

    }
    public static double avgThree(int a, int b, int c){

        double avg =  (a+b+c)/3.0;
        return avg;
    }
}
