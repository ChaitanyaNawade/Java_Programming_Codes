import java.util.Scanner;

class Accounts {
    private int AccountNumber;
    private String AccountHolderName;
    private double Balance;

    Accounts(int A, String B, double C) {
        this.AccountNumber = A;
        this.AccountHolderName = B;
        this.Balance = C;
    }

    public int GetAccountNumber() {
        return AccountNumber;
    }

    public void DepositAmount(int DepositAmt) {
        Balance = Balance + DepositAmt;
        System.out.println("Deposited : " + DepositAmt);
        System.out.println("Available balance is : " + Balance);
    }

    public void Withdraw(int WithdrawAmt) {
        if (WithdrawAmt <= Balance) {
            Balance = Balance - WithdrawAmt;
            System.out.println("Withdraw Successfully : " + WithdrawAmt);
            System.out.println("Available balance is : " + Balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void DisplayDetails() {
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Account Holder name is : " + AccountHolderName);
        System.out.println("The initial balance is : " + Balance);
    }
}

class Miniproject2 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Choice = 0;
        Accounts accounts[] = new Accounts[5];
        int Count = 0;

        Accounts aobj = new Accounts(10223345, "Chaitanya Nawade", 5700.99);
        Accounts aobj1 = new Accounts(20335466, "Aniket bhos", 20000.2);

        do {

            System.out.println("\nEnter the option from below");
            System.out.println("1 : To create new account");
            System.out.println("2 : To get the account number of user");
            System.out.println("3 : To deposit money");
            System.out.println("4 : To Withdraw money");
            System.out.println("5 : Exit");
            Choice = sobj.nextInt();

            switch (Choice) 
            {
                case 1: 
                    if(Count < accounts.length)
                    {
                     System.out.println("Enter account number");
                     int AccNum = sobj.nextInt();
                     sobj.nextLine();
                     System.out.println("Enter account holder name");
                     String name = sobj.nextLine();
                     System.out.println("Enter the initial balance");
                     double Bal = sobj.nextDouble();
                     accounts [Count] = new Accounts(AccNum,name,Bal);
                     Count++;
                     System.out.println("Account created successfully");
                    }
                    else 
                    {
                        System.out.println("Account limit reached");
                    }

                    break;

                case 2:
                    System.out.println("The account number is : " + aobj.GetAccountNumber());
                    break;

                case 3:
                    System.out.println("Enter the amount how much you want to Deposit");
                    int DepositAmt = sobj.nextInt();
                    aobj.DepositAmount(DepositAmt);
                    break;

                case 4:
                    System.out.println("Enter the amount which you want to withdraw");
                    int WithdrawAmt = sobj.nextInt();
                    aobj.Withdraw(WithdrawAmt);
                    break;

                case 5:
                    System.out.println("Thank for using our application");
                    break;

                default:
                    System.out.println("Choose appropriate option from below");
                    break;
            }
        } while (Choice != 5);
    }
}