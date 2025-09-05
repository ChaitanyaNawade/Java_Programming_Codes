import java.io.*;

class InputDemoXX1
{
    public static void main(String A[])throws IOException
    {
       
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name :");
    
        String Name = bobj.readLine();
        
        System.out.println("Welcome "+Name);

        int no = 0;
        try
        {
           no  = Integer.parseInt(Name);
        }
        catch(NumberFormatException nobj)
        {

        }
        
        System.out.println("Number is"+no);
    }
}