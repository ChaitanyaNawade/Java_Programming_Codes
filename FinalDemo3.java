
class Demo
{
    public void Fun()
    {
        System.out.println("Inside Demo Fun");
    }

    public final void Gun()
    {
        System.out.println("Inside Demo Gun");
    }
}

class Hello extends Demo
{
    public void Fun()
    {
        System.out.println("Inside Hello Fun");               //overriding allowed
    } 

    /* 
    public void Gun()
    {
        System.out.println("Inside Hello Gun");   not allowed overriding
    }
    */
}

class FinalDemo3
{
    public  static void main(String A[])
    {
       Hello hobj = new Hello();
       hobj.Fun();                //Hello Fun 
       hobj.Gun();                //Demo gun
    }
}