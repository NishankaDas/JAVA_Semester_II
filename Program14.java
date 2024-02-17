// package Banking;
// public class BankAccount
// {
//     public double min_bal;
//     public String accn_holder;
//     public float rof;
//     public BankAccount()
//     {
//         min_bal=0.0;
//         rof=0.0f;
//         accn_holder="";
//     }
//     public BankAccount(double mb,String n)
//     {
//         this();
//         min_bal=mb;
//         accn_holder=n;
//     }
//     public void BankGreetings()
//     {
//         System.out.println("Welcome to our Bank!! Wish to give you the best banking service...Thank you!!");
//     }
//     public void RateOfInterest(float r)
//     {
//         rof=r;
//     }
// }
//For Savings Account Class by importing Banking Package and inheriting it’s class.
// import Banking.BankAccount;
import java.util.*;
public class SavingsAccount extends BankAccount
{
    double sav_bal;
    SavingsAccount(String n1)
    {
        super(2000.0,n1);
        super.RateOfInterest(8.6f);
        super.BankGreetings();
        sav_bal=0.0;
    }
    void DisplayDetails()
    {
        System.out.println("Account Holder: "+super.accn_holder);
        System.out.println("Account type: Savings");
        System.out.println("Rate of Interest: "+super.rof+"% p.a.");
        System.out.println("Minimum Balance required to open the account: Rs."+super.min_bal);
    }
    void CreditAmount(double c)  
    {
        sav_bal=sav_bal+c;
        System.out.println("Amount in your account after credit: Rs."+sav_bal);
    }
    int DebitAmount(double d)
    {
        sav_bal=sav_bal-d;
        System.out.println("Amount in rour account after debit: Rs."+sav_bal);
        if (sav_bal<super.min_bal)
        return -999;
        else
        return +999;
    }
    void GetInterest()
    {
        double I;
        I=sav_bal*super.rof*5/100;
        System.out.println("Principal Amount: Rs."+sav_bal);
        System.out.println("Rate of Interest: "+super.rof+"% p.a");
        System.out.println("Tenure: 5 years");
        System.out.println("Interest after 5 years: Rs."+I);
    }
}
//For the Test Class containing main()
import java.util.*;
public clas Program14
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String nn;
        double cr_amt,db_amt;
        int ch1,counter=0;
        System.out.println("Enter Account Holder's name: ");
        nn=sc.nextLine();
        SavingsAccount sa=new SavingsAccount(nn);
        sa.DisplayDetails();
        do
        {
        System.out.println("Enter 1 to deposit amount, 2 to withdraw amount and 3 to see interest amount after 5 yrs: ");
        ch1=sc.nextInt();
        switch (ch1)
        {
            case 1:
            do
            {
            System.out.println("Enter the amount you want to deposit: ");
            cr_amt=sc.nextDouble();
            if (cr_amt<sa.min_bal && counter==0 )
            System.out.println("The amount has to be more than or equal to minimum balance");
            }
            while (cr_amt<sa.min_bal && counter==0);
            sa.CreditAmount(cr_amt);
            counter=counter+1;
            break;
            case 2:
            if (sa.sav_bal>=sa.min_bal)
            {
                do
                {
                System.out.println("Enter the amount you want to withdraw: ");
                db_amt=sc.nextDouble();
                if ((sa.sav_bal-db_amt)<sa.min_bal)
                System.out.println("The balance amount after withdrawal should be greater than or equal to minimum balance");
                }
                while ((sa.sav_bal-db_amt)<sa.min_bal);
                sa.DebitAmount(db_amt);
            }
            else 
            System.out.println("The current saving balance has to be more than or equal to minimum balance");
            break;
            case 3:
            sa.GetInterest();
            break;
            case 4:
            System.out.println("No Transactions !! Thank you!!");
        }
        } while (ch1<=4);
    }
}
