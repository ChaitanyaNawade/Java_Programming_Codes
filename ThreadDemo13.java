//This code is written to the demonstrate the concept of the synchronization in java
//synchronization is concept where only one thread can access the particular part of the code

class BankAccount
{
    private int Balance = 1000;

    public void Withdraw(int Amount)
    {
        if(Amount  <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+ "Successfully wihtdraw the money");
            Balance = Balance - Amount;
            System.out.println("The reamaining balance amount is : "+Balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+ "you cannot withdraw amount :");
        }
    }
}

class Customer extends Thread
{
    public BankAccount bobj;

    public Customer(BankAccount obj,String Name)
    {
        super(Name);
        this.bobj = obj;
    }

    public void run()
    {
        bobj.Withdraw(800);
    }
}

class ThreadDemo13
{
    public static void main(String A[])
    {
        BankAccount bobj = new BankAccount();
        Customer cobj1 = new Customer(bobj, "Sagar");     //new state of the thread
        Customer cobj2 = new Customer(bobj, "Sumit");


        cobj1.start();                      //Runnable state of thread
        cobj2.start();

        try
        {
        cobj1.join();                       
        cobj2.join();
        }
        catch(InterruptedException iobj)
        {
            
        }

        System.out.println("End of Banking Application");
    }
}