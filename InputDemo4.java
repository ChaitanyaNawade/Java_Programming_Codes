import java.io.*;

public class InputDemo4 
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a character");

        String Name = null;
        char ch =' ';

        try 
        {
            Name  = bobj.readLine();
            ch = Name.charAt(0);
        }
        catch(IOException iobj)
        {
           
        }

        System.out.println("You entered the character : "+ch);

    }
}