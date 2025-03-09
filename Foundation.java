import java.util.Scanner;
class Account{
    private String password;

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void News(){
        System.out.println("Welcome to the bank");
    }
}

class Bank extends Account{
    private int Cash = 0;
    public void SetCash(int Cash){
        this.Cash = Cash;
    }
    public int GetCash(){
        return Cash;
    }
    public void News(){
        System.out.println("Welcome to the bank of baroda");
    }
}
public class Foundation {
    public static void main(String[] args){
        Bank ac = new Bank();
        Scanner sc = new Scanner(System.in);
        Scanner usage = new Scanner(System.in);
        System.out.println("Set Password");
        ac.setPassword(sc.nextLine());
        System.out.println("Enter cash to deposit");
        ac.SetCash(sc.nextInt());
        System.out.println("Enter password to view balance..");
        String password = usage.nextLine();
        if(ac.getPassword().equals(password)){
            System.out.println("Your balance is "+ac.GetCash());
        }
        else{
            System.out.println("Invalid password");
        }  
        ac.News();
    }
}


