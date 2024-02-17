
import Banking.BankAccount;
//import Banking.BankAccount.FixedDepositAccount;

import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float q;
       // String str , str1;
       System.out.println("Enter Ammount: ");
        q = s.nextFloat();
        if(q<2000)
        {
            q=0;
            System.out.println("Min Account Balence is 2000\n Re-enter Your Ammount");
            q = s.nextFloat();
        }
        try{
        BankAccount b = new BankAccount();
        BankAccount.SavingsAccount sv = b.new SavingsAccount();
        BankAccount.FixedDepositAccount fx = b.new FixedDepositAccount();
        sv.interest(q);
        sv.display_s();
        fx.interest(q);
        b.display();
        }
        catch(Exception ex){
            System.out.println("Dhur");
        }
    }
}
