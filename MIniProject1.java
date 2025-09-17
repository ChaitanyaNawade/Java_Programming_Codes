import java.util.Scanner;

class Account {
    private int accountNumber;
    private double Balance;
    private String holderName;

    public Account(int A, double B, String C) 
    {
        this.accountNumber = A;
        this.Balance = B;
        this.holderName = C;
    }

    // Deposit method to Deposit the money
    public void Deposit(int Amount) 
    {
        Balance = Balance + Amount;
        System.out.println("Despoited : " + Amount);
    }

    // Withdraw method to withdraw money from the balance
    public void Withdraw(int Amount) 
    {
        if (Amount <= Balance)
        {
            Balance = Balance - Amount;
        } else 
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Display balance method for the displaying the balance and the details of the
    // account holder
    public void DisplayBalance() {
        System.out.println("Account Holder name : " + holderName);
        System.out.println("Balace is : " + Balance);
        System.out.println("The Account number is : "+accountNumber);
    }
}

class MiniProject1 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int choice = 0;

         Account aobj = new Account(10455421, 1000.200, "Chaitanya Nawade");
        do {
            System.out.println("\nChoose the option from the below");
            System.out.println("1 : To Deposit the amount in Account");
            System.out.println("2 : To withdraw the amount from the Accounnt");
            System.out.println("3 : To Display the balance");
            System.out.println("4 : Exit");

            choice = sobj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount want to Deposit");
                    int Amount = sobj.nextInt();
                    aobj.Deposit(Amount);
                    break;

                case 2:
                    System.out.println("Enter the withdraw amount");
                    int WithdrawAmt = sobj.nextInt();
                    aobj.Withdraw(WithdrawAmt);
                    break;

                case 3:
                    aobj.DisplayBalance();
                    break;

                case 4:
                    System.out.println("Thank for using our application");
                    break;

                default:
                    System.out.println("Please choose the appropriate option");
                    break;
            }
        } while (choice != 4);
    }
}