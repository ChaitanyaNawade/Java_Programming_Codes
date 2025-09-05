import java.io.*;

class InputDemoXX
{
    public static void main(String A[])throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);

        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name :");

        String Name = null;

        try
        {
         Name = bobj.readLine();
        }
        catch(IOException eobj)
        {
            
        }

        System.out.println("Welcome "+Name);
    }
}