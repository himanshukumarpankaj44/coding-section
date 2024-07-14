import java.util.*;
public class ShortestPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.println("Enter the direction in the form of s,w,e,n:");
        path = sc.next();
        System.out.println("Shortest path of the distance is:"+getShortest(path));

    }
    public static float getShortest(String path){
        int x = 0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //for south direction
            if(dir == 's' || dir == 'S'){
                y--;
            }
            // for north direction
            else if(dir == 'n' || dir == 'N'){
                y++;
            }
            // for east direction
           else  if(dir == 'e' || dir == 'E'){
                x++;
            }
           // for west direction
           else if(dir == 'w' || dir == 'W') {
               x--;
            }
           // suppose someone entered wrong direction in that
            // scenario we have else condition
            else {
                System.out.println("You have entered wrong credentials:");
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }
}
