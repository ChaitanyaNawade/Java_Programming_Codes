import java.util.Scanner;

class Arithmatic
{
    //This function is going to throw the exception
    public float Division(int No1,int No2)throws ArithmeticException
    {
        int Ans = No1/No2;
        return Ans;
    }
}

class ExceptionDemo3
{
    public static void main(String A[])
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int Value1 = sobj.nextInt();

        System.out.println("Enter second number :");
        int Value2 = sobj.nextInt();

        float iRet = 0.0f;

        //Function call we written in the try block  this block is going to handle the exception
        try{
        Arithmatic aobj = new Arithmatic();

        iRet =  aobj.Division(Value1, Value2);

        }//End of the try block

        catch(ArithmeticException obj)
        {
            System.out.println("Inside the catch");
        }//End of the catch block 

         System.out.println("Division is : "+iRet);
    }
}