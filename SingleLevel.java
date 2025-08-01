class Base
{
  public int A,B;
  public Base()
  {
    System.out.println("Inside Base constructor");
  }

  public void Fun()
  {
    System.out.println("Inside fun of Base class");
  }
}

class Derived extends Base           //class Derived : public Base
{
  public int X,Y;
  public Derived()
  {
    System.out.println("Inside Derived constructor");
  }

  public void Gun()
  {
    System.out.println("Inside Gun of Derived class");
  }


}
class SingleLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        dobj.Fun();
        dobj.Gun();
    }
}