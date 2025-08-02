import java.util.Scanner;

class BankAccount 
{
    private int Balance;

    public BankAccount(int iBal)
    {
        this.Balance = iBal;
    }

    public synchronized int Withdraw(int Amount)
    {
        if(Amount <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+" Succesfully withdraw the amount");
            Balance = Balance - Amount;
        }
        else 
        {
            System.out.println(Thread.currentThread().getName()+" Unable to withdraw the amount");
        }
        return Balance;
    }
}

class Customer extends Thread
{
    Scanner sobj = new Scanner(System.in);

    public BankAccount bobj;
    int iRet = 0;

    public Customer(BankAccount obj,String Name)
    {
        super(Name);
        this.bobj = obj;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" Enter the amount which you want to withdraw from your account");
        int iAm = sobj.nextInt();
        iRet =  bobj.Withdraw(iAm);
        System.out.println(Thread.currentThread().getName()+" The reamining amount is " + iRet);
    }
}

class ThreadDemo14
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your total balance");
        int iBal = sobj.nextInt();
    
        BankAccount bobj = new BankAccount(iBal);
        System.out.println(bobj);

        Customer cobj = new Customer(bobj,"Sagar");
        System.out.println(bobj);
        cobj.start();  
         
        Customer cobj1 = new Customer(bobj, "sumit");
        cobj1.start();
        cobj1.join();
        cobj.join();
    }
}