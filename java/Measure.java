import java.util.*;
public class Measure {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the measure in feet:");
        float feet=sc.nextFloat();
        double cem=feet*12;
        System.out.println("Measure in centimeter:"+cem);
        System.out.println("Enter the measure in inches:");
        float inch=sc.nextFloat();
        cem=(inch * 2.54);
        System.out.println("Measure in centimeter:"+cem);
        sc.close();
    }
    
}
