//This Program illustrates the concept of the multilevel  inheritance in java
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
    public int k,l;

    public void DisplayDerived()
    {
        System.out.println("Inside the Display of Derived");
    }
}

class DerivedX extends Derived
{
    public int m,n;

    public void DisplayDerivedX()
    {
        System.out.println("Inside the Display of Derived X");
    }
}

public class MultilevelX 
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();
        dobj.DisplayBase();
        dobj.DisplayDerived();
        dobj.DisplayDerivedX();
    }
}