class Base 
{
    public int i,j;

    public void Display()
    {
        System.out.println("Inside the display of Base");
    }
}

class Derived extends Base 
{
    public int k,l;

    public void display()
    {
        System.out.println("Inside the display of Derived");
    }
}

class DerivedX extends Base 
{
    public void DisplayDerivedX()
    {
        System.out.println("Insid the display of DerivedX");
    }
}

public class Hierarchical 
{
    public static void main(String A[])
    {
        Derived dobj1 = new Derived();
        DerivedX dobj2 = new DerivedX();
        dobj1.Display();
        dobj1.display();
        dobj2.Display();
        dobj2.DisplayDerivedX();
    }
}