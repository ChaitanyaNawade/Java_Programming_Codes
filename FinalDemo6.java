class Base 
{
    public int i;
    public final int j = 21;

    public Base()
    {
        this.i = 10;
    }

    public void Display()
    {
        System.out.println("The value of i is : "+i);
        System.out.println("The value of j is : "+j);
    }
}

public class FinalDemo6
{
    public static void main(String A[])
    {
        Base bobj = new Base();
        bobj.i++;
        //bobj.j++;
        bobj.Display();
    }
}