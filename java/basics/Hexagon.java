import java.util.*;
public class Hexagon {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side length of hexagon:");
        int size=sc.nextInt();
        
        double area=(6*Math.pow(size,2))/(4*Math.tan(Math.PI/6));
        System.out.println("Area of hexagon is:"+area);
        sc.close();
    }

}
