
final class Demo
{
    public int i = 11;
    public void Fun()
    {
      System.out.println("Inside Demo Fun");
    }
}

class Hello 
{
    public Demo dobj;//compostion means creating the object of final class into another class consttructor
    public int j = 20;
    Hello()
    {
      dobj = new Demo();
    }
}


class FinalDemo5
{
    public  static void main(String A[])
    {
      Hello hobj = new Hello();
      System.out.println("value of i is"+hobj.dobj.i);
      System.out.println("value of j is"+hobj.j);
      hobj.dobj.Fun();
    }
}