class Base 
{
    public int i;
    public int j;

    public static int k;

    static
    {
        k = 33;
    }

    Base(int A,int B)
    {
        this.i = A;
        this.j = B;
    }

    public void show()
    {
        System.out.println("i : "+i);
        System.out.println("j : "+j);
        System.out.println("k : "+k);
    }

    static void Display()
    {
        Base bobj = new Base(10, 20);
        System.out.println("i : "+bobj.i);
        System.out.println("j : "+bobj.j);
        System.out.println("k : "+k);
    }
}

class StaticDemo7 
{
    public static void main(String A[])
    {
        Base bobj1 = new Base(20, 30);
        bobj1.show();
        Base.Display();
    }
}