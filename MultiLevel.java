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
class DerivedX extends Derived
{
  public int L,M;
  public DerivedX()
  {
    System.out.println("Inside DerivedX Constructor");
  }

  public void Sun()
  {
    System.out.println("Inside the Sun of DerivedX class");
  }
}


class MultiLevel
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        DerivedX dobj = new DerivedX();

        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
    }
}