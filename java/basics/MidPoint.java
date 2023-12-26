import java.util.*;
public class MidPoint {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x and y co-ordinate of 1st point:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter the x and y co-ordinate of 2nd point:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x=(x1+x2)/2;
        int y=(y1+y2)/2;
        System.out.println("Mid point is ("+x+","+y+")");
        sc.close();
    }
    
}
