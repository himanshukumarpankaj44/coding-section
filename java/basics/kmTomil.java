import java.util.*;
public class kmTomil {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the distance in km:");
    float k=sc.nextFloat();
    double mile=k/1.67;
    System.out.println("Distance in mile: "+mile);
    System.out.println("Distance in mile: "+String.format("%.2f",mile));
    sc.close();
    }
}
