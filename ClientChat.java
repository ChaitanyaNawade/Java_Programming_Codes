import java.net.*;
import java.io.*;
class ClientChat
{
    public static void main(String A[]) throws Exception
    {
      
        System.out.println("Client is REady to connetc with server");
        
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client  is succressfully connected with server");
       

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        String str = bobj1.readLine();
        System.out.println("Message from sever :"+str);

        pobj.println("Hii meassage from client");
    }
}