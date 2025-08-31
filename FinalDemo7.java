class Base 
{
    public void Gun()
    {
        System.out.println("Inside the Gun of BAse");
    }

    final public void Run()
    {
        System.out.println("Inside the Run of Base");
    }
}

class Derived extends Base 
{
    public void gun()
    {
        System.out.println("Inside the Gun of Derived");
    }
    
}
public class FinalDemo7 
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.Gun();
        dobj.Run();
    }
}