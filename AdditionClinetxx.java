import java.net.*;
import java.io.*;
import java.util.*;

class AdditioClinettxx
{
public static void main(String[] args) throws Exception
{
     

    Socket sobj = new Socket("localhost",2100);

    DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear 
    DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); //mouth

    doobj.writeInt(11);
}   
    
}