import java.io.*;

class FileIo2
{
    public static void main(String[] args) throws Exception
    {
      try{
      FileWriter fwobj = new FileWriter("Marvellous.txt");
      fwobj.write("pre placement activity barch 53");
      fwobj.write("logic building with industrial project developmet");
      fwobj.close();
     }

     catch(Exception obj)
     {
      System.out.println("Exception occured :"+obj);
     }
    }
}