import java.util.*;
public class TriangleArea {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the three side of triangle:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int s= (a+b+c)/2;
    double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of triangle is:"+area);
    sc.close();
  }  
}
