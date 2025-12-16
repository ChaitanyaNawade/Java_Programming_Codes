
import java.util.Scanner;

class InsufficientBalanceException extends  Exception
{
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}

class Bank
{
    public int Balance;

    public Bank(int Balance)
    {
        this.Balance = Balance;
    }


    public void withdraw(int Amount) throws InsufficientBalanceException
    {
        if(Amount <= Balance)
        {
            Balance -= Amount;
            System.out.println("Withdraw successful...!");
            System.out.println("The Remaining amount is "+Balance);
        }else 
        {
            throw new InsufficientBalanceException("not enough in you account");
        }
    }
}


class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter you initial balance");

        int Balance = sobj.nextInt();

        System.out.println("Enter the amount which you want to withdraw");

        int amt = sobj.nextInt();

        Bank dobj = new Bank(Balance);

        try
        {
            dobj.withdraw(amt);
        }
        catch(InsufficientBalanceException i)
        {
            System.out.println(i.getMessage());
        }
        
    }
}