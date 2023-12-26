import java.util.*;
public class Distance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point co-ordinates:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter the ending point co-ordinates:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x=x2-x1;
        int y=y2-y1;
        System.out.println("Distance of the two points is ("+x+","+y+")");
        sc.close();
    }
}