class Base 
{
    public int i,j;

    public void DisplayBase()
    {
        System.out.println("Inside the Display of Base");
    }
}

class Derived extends Base 
{
    public void DisplayDerived()
    {
        System.out.println("Inside the display of Derived");
    }
}

public class SingleLevelX 
{
    public static void main(String A[])
    {
        Derived dobj  = new Derived();
        dobj.DisplayBase();
        dobj.DisplayDerived();
    }
}