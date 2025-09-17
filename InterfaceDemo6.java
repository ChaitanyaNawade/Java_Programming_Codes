interface Demo 
{
    int i  = 100;

    void Show();
}

interface Derived 
{
    void Grow();
}

class DerivedX implements Demo,Derived
{
    public void Show()
    {
        System.out.println("Inside the show");
    }

    public void Grow()
    {
        System.out.println("Inside the grow");
    }
}


class InterfaceDemo6 
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();
        dobj.Grow();
        dobj.Show();
        System.out.println("i = "+Demo
        .i);
    }
}
