class Demo
{
    public int i,j;

    Demo()
    {
        this.i = 10;
        this.j = 20;
        System.out.println("Inside the Constructor");
    }

    public void Display()
    {
        System.out.println("Inside the display");
        System.out.println("i : "+i);
        System.out.println("j : "+j);
    }

    protected void finalize()
    {
        System.out.println("Inside the destructor");
    }
}


class Constructor
{
    public static void main(String A[])
    {
        Demo dobj;
        dobj = new Demo();
        dobj.Display();
        dobj = null;
        System.gc();
    }
}