public class uniqueUsing1234 {
    public static void main(String args[]){
        System.out.println("Display number using 1,2,3,4 and count:");
        int count= 0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j && i != k && j!=k){
                        count++;
                        System.out.print(i+""+j+""+k+",");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count+" numbers digit can be created ");
    }
    
}
