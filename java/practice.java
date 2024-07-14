import java.util.*;
public class practice {
    public static void main(String[] args){
        //System.out.println((6>2) || (4> 2));
        System.out.println("Enter the year to check weather it is leap year or not:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("year:"+year+" is a leap century");
        }else if(year % 100== 0 ){
             System.out.println("year:"+year+" is not a leap year");
        } else if(year % 4 == 0){
            System.out.println("year:"+year+" is a leap year");
        }else{
            System.out.println("year:"+year+" is not a leap year");
        }
        sc.close();
    }
    }