import java.util.*;
public class Rectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area= l*b;
        int per=2*(l+b);
        double h=Math.sqrt(b*b+l*l);
        System.out.println("Rectangle area:"+area+" perimeter:"+per+" Hypotenious:"+h);
        sc.close();
    }
    
}
