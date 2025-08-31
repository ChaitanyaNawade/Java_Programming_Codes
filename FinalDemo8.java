final class Demo 
{
    public void Gun()
    {
        System.out.println("Inside the Gun");
    }
}

class Derived 
{
    Demo dobj = new Demo();
    public void Run()
    {
        System.out.println("Inside the run of DErived");
    }
    
}

public class FinalDemo8 
{
    public static void main(String A[])
    {
        Derived dobj1 = new Derived();
        dobj1.Run();
        dobj1.dobj.Gun();
    }
}