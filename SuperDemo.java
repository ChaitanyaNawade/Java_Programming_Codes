class Base
{

 public int x,y;

 Base(int A, int B)
 {
    this.x = A;
    this.y = B;
 }

 public void Display()
 {
    System.out.println("Insdie the base fun");
 }

}

class Derived extends Base
{
    public int x,y;

    Derived()
    {
        super(11,21);           //use 1 of super keyword
        this.x = 51;
        this.y = 101;
    }

    public void Fun()
    {
        super.Display();           //use to acces the parent class method
        System.out.println("Inside the Derived Fun");
        System.out.println("Value of x is :"+x);
        System.out.println("Value of y is :"+y);
        System.out.println("Value of x using super is :"+super.x);
        System.out.println("Value of y using super is :"+super.y);
    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.Fun();
    }
}