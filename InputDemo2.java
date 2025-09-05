import java.io.*;

class InputDemo2 
{
    public static void main(String A[])
    {
        
        
            //connected to the system using InputStreamReader
            InputStreamReader iobj = new InputStreamReader(System.in);

            //To store the input we used the BufferedReader
            BufferedReader bobj = new BufferedReader(iobj);

            System.out.println("Enter your name");

            String name = null;
        try 
        {
           name  = bobj.readLine();
        }
        catch(IOException eeobj)
        {
           
        }
        

        

        System.out.println("welcome "+name);
    }
}