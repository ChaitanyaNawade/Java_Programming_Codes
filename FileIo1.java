import java.io.*;

class FileIo1
{
    public static void main(String[] args) throws Exception
    {
      File fobj = new File("Marvellous.txt");
      
     if(fobj.createNewFile())
     {
        System.out.println("File is succressfully ccreated");
        FileWriter fwobj = new FileWriter("Marvellous.txt");
       void ret = fwobj.write("Pre-Placement Activity batch 53");
       System.out.println(ret);
     }
     else
     {
       System.out.println("Unable to create file");
     }
    }
}