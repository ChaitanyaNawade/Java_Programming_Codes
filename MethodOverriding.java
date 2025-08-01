class Base
{
    public void Fun()
    {
        System.out.println("Base Fun");
    }

    public void Gun()
    {
        System.out.println("Base Gun");
    }

    public void Sun()
    {
        System.out.println("Base Sun");
    }
}

class Derived extends Base
{
    public void Fun()
    {
        System.out.println("Derived Fun");
    }

    public void Run()
    {
        System.out.println("Derived Run");
    }

}

class MethodOverriding
{
    public static void main(String A[])
    {
        //Base bobj1 = new Base();                  //no casting
        //Derived dobj1 = new Derived();            //no casting
        //Base bobj2 = new Derived();               //up casting
        //Derived dobj2 = new Base();               //down Casting not allowed     
        Base bobj  = new Derived();
        bobj.Fun();                                //Derived Fun
        bobj.Gun();                                //Base Gun
        bobj.Sun();                                //Base Sun
        //bobj.Run();                              //error
    }
}