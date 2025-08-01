import java.net.*;
import java.io.*;
class ClientChatX
{
    public static void main(String A[]) throws Exception
    {
      
        System.out.println("Client is REady to connetc with server");
        
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client  is succressfully connected with server");
       

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("__________________");
        System.out.println("Marvellous chat messanger is ready to use");
        System.out.println("____________________");

        String str1 = null,str2 = null;

        while(!(str1 = bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says :"+str2);
            System.out.println("Enter meassage for server: ");
        }
    }
}