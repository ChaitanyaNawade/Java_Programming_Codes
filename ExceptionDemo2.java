import java.util.Scanner;

class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);        // connect with the keyboard

        System.out.println("Enter first number");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number");
        int No2 = sobj.nextInt();

        int Ans = 0;
        try
        {
            System.out.println("Inside the try block");
            Ans = No1 / No2;
            System.out.println("Division is successfully executed");
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block "+obj);
        }

        catch(Exception eobj)        //generic catch
        {
            System.out.println("Inside the generic catch block");
        }

        finally
        {
            System.out.println("Inside finally block");
        }
        
        System.out.println("Division is "+Ans);
    }
}