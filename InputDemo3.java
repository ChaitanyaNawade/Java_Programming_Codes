import java.io.*;

class InputDemo3 
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name");

        String Name = null;
        try 
        {
         Name = bobj.readLine();
        }
        catch(IOException iobj)
        {
            
        }

        System.out.println("Welcome "+Name);

        int no1 = 0;
        int no2 = 0;
        try 
        {
            System.out.println("Enter the first number");
            no1 = Integer.parseInt(bobj.readLine());
            System.out.println("Enter the second number");
             no2 = Integer.parseInt(bobj.readLine());
        }
        catch( IOException nobj) 
        {

        }
       

        int Ans = no1 + no2;
        System.out.println("Addition of two numbers is : "+Ans);
    }
}