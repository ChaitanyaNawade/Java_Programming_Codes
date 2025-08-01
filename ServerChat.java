import java.net.*;
import java.io.*;

class ServerChat
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous server is waiting at port no 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Marvellous server is successfully connected with the client");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

         BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

         BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

         pobj.println("Hello from sever");


         String str = bobj1.readLine();
         System.out.println("Message from client :"+str);
    } 
}