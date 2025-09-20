import java.util.*;

import javax.sql.rowset.spi.SyncResolver;


//Account class represents a back account with basic operations
class Account {
    private int accountNumber;
    private double Balance;
    private String holderName;

    //This is constructor which is used to initalize the characteristics of Account class
    public Account(int A, double B, String C) 
    {
        this.accountNumber = A;
        this.Balance = B;
        this.holderName = C;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getter method for account number
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // Deposit method to Deposit the money
    public void Deposit(double Amount) 
    {
        Balance = Balance + Amount;
        System.out.println("Despoited : " + Amount);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Withdraw method to withdraw money from the balance
    public void Withdraw(double Amount) 
    {
        if (Amount <= Balance)
        {
            Balance = Balance - Amount;
            System.out.println("Withdraw : "+Amount);
            System.out.println("Remaining balance is : "+Balance);
        } else 
        {
            System.out.println("Insufficient Balance");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    
    // Display balance method for the displaying the balance and the details of the
    // account holder
    public void DisplayBalance() {
        System.out.println("Account Holder name : " + holderName);
        System.out.println("Balace is : " + Balance);
        System.out.println("The Account number is : "+accountNumber);
    }
}

//Main class    
class MiniProject1 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int choice = 0;

        //Creating two sample account
         Account aobj = new Account(10455421, 1000.200, "Chaitanya Nawade");
         Account aobj1 = new Account(1004544454,5000.58,"Aniket bhos");

         //Using hashmap to store multiple accounts(key , value)
         Map<Integer,Account> Accounts = new HashMap<>();
         Accounts.put(aobj.getAccountNumber(),aobj);
         Accounts.put(aobj1.getAccountNumber(),aobj1);
        

         //Menu driven program
        do {
            System.out.println("\nChoose the option from the below");
            System.out.println("1 : To Deposit the amount in Account");
            System.out.println("2 : To withdraw the amount from the Accounnt");
            System.out.println("3 : To Display the balance");
            System.out.println("4 : To create a new account");
            System.out.println("5 : Exit");

            choice = sobj.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the account number : ");
                    int AccountNum = sobj.nextInt();
                    Account acc1 = Accounts.get(AccountNum);

                    if(acc1 != null)
                    {
                        System.out.println("Enter the amount you want to deposit");
                        int Amount = sobj.nextInt();
                        acc1.Deposit(Amount);
                    }
                    else 
                    {
                        System.out.println("Account not found");
                    }
                    break;

                case 2:
                    System.out.println("Enter the account number");
                    int AccountNum1 = sobj.nextInt();
                    Account acc2 = Accounts.get(AccountNum1);
                    if(acc2 != null)
                    {
                        System.out.println("Enter amount to withdraw : ");
                        int WithdrawAmt = sobj.nextInt();
                        acc2.Withdraw(WithdrawAmt);
                    }
                    else 
                    {
                        System.out.println("Account not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter the account number");
                    int AccountNum3 = sobj.nextInt();
                    Account acc3 = Accounts.get(AccountNum3);
                    if(acc3 != null)
                    {
                        acc3.DisplayBalance();
                    }
                    else 
                    {
                        System.out.println("Account not found");
                    }

                    break;

                case 4:
                    System.out.println("Enter account number : ");
                    int AccountNum4 = sobj.nextInt();
                    sobj.nextLine();

                    System.out.println("Enter Account Holder name :");
                    String HolderName = sobj.nextLine();

                    System.out.println("Enter initial balance : ");
                    double balance = sobj.nextDouble();
                    Account aobj2 = new Account(AccountNum4,balance,HolderName);
                    Accounts.put(aobj2.getAccountNumber(),aobj2);

                    System.out.println("New account created successfully !");
                    break;

                case 5:
                    System.out.println("Thank for using our application");
                    break;

                default:
                    System.out.println("Please choose the appropriate option");
                    break;
            }
        } while (choice != 5);

        sobj.close();
    }
}