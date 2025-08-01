import java.net.*;
import java.io.*;
import java.util.*;

class AdditioClient
{
public static void main(String[] args) throws Exception
{
    ServerSocket ssobj = new ServerSocket(2100);
    System.out.println("server is waiting at port 2100");
    Socket sobj = ssobj.accept();
    System.out.println("clinet request arrives and connected successfully");
    DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
    DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); //mouth
}   
    
}