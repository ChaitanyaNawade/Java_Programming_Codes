import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputDemoXX2
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int Age  = 0;
        String Name = "\0";
        try
        {
        System.out.println("Enter your Age : ");
         Age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your name :");
         Name = bobj.readLine();
        }

        catch(IOException obj)
        {

        }
        System.out.println("Hello "+Name+" you are "+Age+" years old ");
    }
}