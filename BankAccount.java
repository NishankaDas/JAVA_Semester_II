package Banking;
import java.util.*;
public class BankAccount {
   float balence,balance1;
   Scanner sc = new Scanner(System.in);
  String Name,IFS;
    int acc;
   public BankAccount()
   {
    System.out.println("Enter the Your name : " );
    Name = sc.nextLine();
    System.out.println("Enter your ACC number");
    acc = sc.nextInt();
  //  IFS = sc.nextLine();
   }
   
    public class SavingsAccount{
        
        public void interest(float inp){
            balence = inp;
            if(inp<2000)
        {
            System.out.println("The opening balence of the account is 2000 Rs.");
        }  
            float interest_s;
            interest_s = (inp*4)/100;
            System.out.println("Your interest on Savings Account balence @ 4%  for 5 year is : "+interest_s*5+"\n");
            
    }
    public void display_s(){
        boolean k=true;
        int u;
        while(k){
        System.out.println("Quaries  : Savings Account :  :  : \n1)Check Balence\n2)Credit\n3)Debit");
     
        int c = sc.nextInt();
        switch (c) {
            case 1:
                {
                    System.out.println("Your Bank Balence is : "+balence);
                    System.out.println("If any service needed press 1 or press 0 ");
                    u= sc.nextInt();
                    if(u==1)
                    {
                        k = true;
                    }
                    else{
                        k = false;
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("Enter the credit amount: ");
                    int w = sc.nextInt();
                    balence = balence+w;
                    System.out.println("The Updated Balence is "+ balence);
                    System.out.println("If any service needed press 1 or press 0 ");
                    u = sc.nextInt();
                    if(u==1)
                    {
                        k = true;
                    }
                    else{
                        k = false;
                    }
                    break;
                }  
            case 3:
                {
                    System.out.println("Enter the debit amount: ");
                    int w = sc.nextInt();
                    balence = balence-w;
                    if(balence<2000)
                    {
                        System.out.println("Sorry, Cant be Debited");
                        balence = balence+w;
                    }
                    System.out.println("The Updated Balence is "+ balence);
                    System.out.println("If any service needed press 1 or press 0 ");
                    u = sc.nextInt();
                    if(u==1)
                    {
                        k = true;
                    }
                    else{
                        k = false;
                    }
                    break;
                } 
        
            default:
                break;
        }
    }
    }
   
}
public class FixedDepositAccount{
    public void interest(float inte)
    {
     int z;
     balance1 = inte;
     balance1 = (balance1*8)/100;
     System.out.println("\nThe Interest on your Fixed Deposit Account @ 8% for 5 year is : "+balance1*5);
    }
 }
 public void display(){
     System.out.println("Transation Compleated :"+Name+"\tYour Account number  "+acc+"\t Balence is : "+balence);
 }
}