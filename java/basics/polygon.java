import java.util.*;
public class polygon {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number of sides in polygon:");
    int n=sc.nextInt();
    System.out.println("enter the length of sides of polygon:");
    int size=sc.nextInt();
    double area=(n*Math.pow(size,2))/(4*Math.tan(Math.PI/n));
    System.out.println("Area of polygon is:"+area);
    sc.close();

    }
    
}
