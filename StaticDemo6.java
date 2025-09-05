class Demo 
{
    public static int i;
    public int j;

    static
    {
        i = 10;
    }

    Demo()
    {
        System.out.println("Inside the constructor");
        this.j = 20;
    }

    public void Display()
    {
        System.out.println("The value of i is : "+i);
        System.out.println("The value of j is : "+j);
    }


    static void Fun()   //static methods only can access the static characteristics 
    {
        System.out.println("Inside the static function");
        System.out.println(i);
        // System.out.println(j); //
    }
}

public class StaticDemo6 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();

        System.out.println(Demo.i);
        Demo.Fun();
        dobj.Fun();
    }
}