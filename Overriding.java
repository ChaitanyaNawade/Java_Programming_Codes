class Base 
{
    public int i , j;

    public void fun()
    {
        System.out.println("Inside the fun of Base");
    }

    public void Gun()
    {
        System.out.println("Inside the Gun of base");
    }
}

class Derived extends Base 
{
    public void fun()
    {
        System.out.println("Insid the fin of Derived");
    }

    public void Mun()
    {
        System.out.println("Inside the mun of Derived");
    }
}

class Overriding
{
    public static void main(String A[])
    {
        Base bobj =  new Derived();
        bobj.fun();
        bobj.Gun();
        // bobj.Mun();  // Error
    }
}