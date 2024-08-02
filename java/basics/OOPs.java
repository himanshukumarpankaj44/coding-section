public class OOPs {
    public static void main(String[] args){
        Pen p = new Pen();
        p.setColor("blue");
        p.setTip(100);
        System.out.println(p.getColor());
        System.out.println(p.tip);  
        BankAccount acc = new BankAccount();
        acc.setPassword("hiajkldnfl");
        //System.out.println(acc.password);
    }
}
class Pen{
   private String color;
    int tip;
    
    void setColor(String newcolor){
         this.color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
    String getColor(){
        return this.color;
    }

}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
             password = newPassword;
    }
}
