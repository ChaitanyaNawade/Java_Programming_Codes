class Base
{
    public int i,j;

    public void Fun()
    {
        System.out.println("Base class Fun");
    }

    public void Gun()
    {
        System.out.println("Base class Gun");
    }

    public void Sun()
    {
        System.out.println("Base class sun");
    }
}

class Derived extends Base
{
    public int m,n;

    public void Fun()
    {
        System.out.println("Derived class Fun");
    }

    public void Gun()
    {
        System.out.println("Derivd class Gun");
    }

    public void Sun()
    {
        int k;
        System.out.println("Derived class Sun");
    }

    public void Run()
    {
        System.out.println("Derived class Run");
    }
}
class MethodOverridingX
{
    public static void main(String A[])
    {
        Base bobj = new Derived();
        bobj.Fun();                 //Derived class Fun
        bobj.Gun();                 //Derived class Gun
        bobj.Sun();                 //error
       // bobj.Run();                 //error
    }
}