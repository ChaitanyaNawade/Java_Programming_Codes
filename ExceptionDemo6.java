class Arithmatic 
{
    public int i;
    public int j;
    public int Ans;

    Arithmatic(int A,int B)
    {
        this.i = A;
        this.j = B;
    }

    public float Division() throws ArithmeticException 
    {
        Ans = i/j;
        return Ans;
    }
}

public class ExceptionDemo6 
{
    public static void main(String A[])
    {
         float iRet = 0;

         Arithmatic aobj = new Arithmatic(50, 0);
         try 
         {
            iRet = aobj.Division();
         }
         catch(Exception eobj)
         {

         }
         System.out.println("The division of two numbers is : "+iRet);
    }
}