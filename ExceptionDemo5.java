import java.util.Scanner;

public class ExceptionDemo5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number");
        int Num1 = sobj.nextInt();

        System.out.println("Enter the second number");
        int Num2 = sobj.nextInt();

        int Ans = 0;

        try 
        {
           System.out.println("Inside the try block");
           Ans = Num1 / Num2;
           System.out.println("dividion get successfully executed");
        } 
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside the catch block");
        }
        catch(Exception eobj)
        {
            System.out.println("Inside the generic catch block");
        }
        System.out.println("The division of the two number is : "+ Ans);
    }
}