import java.util.*;
public class Time {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the time in seconds:");
        int sec=sc.nextInt();
        int min=0;
        int hour=0;
        if(sec>59){
            min= sec/60;
            sec=sec%60;
        }
        if(min>59){
            hour=min/60;
            min=min%60;
        }
        System.out.println("Time:"+hour+":"+min+":"+sec);
        sc.close();

    }
    
}
