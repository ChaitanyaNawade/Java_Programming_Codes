import java.net.*;
import java.io.*;

class ServerChatX
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

        System.out.println("__________________");
        System.out.println("Marvellous chat messanger si ready to use");
        System.out.println("____________________");

        String str1 = null,str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client says :"+ str1);
            System.out.println("Ebter the message for client :");
            str2 = bobj2.readLine();
            pobj.println(str1);
        }
    } 
}