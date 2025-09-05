import java.util.Scanner;

class ExceptionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);        // connect with the keyboard1

        System.out.println("Enter first number");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number");
        int No2 = sobj.nextInt();

        int Ans = 0;
        try 
        {
            Ans = No1 / No2;
        }
        catch(ArithmeticException iobj)
        {
            
        }
        
        System.out.println("Division is "+Ans);
    }
}