class Demo 
{
    public int i;
    public int j;

    public Demo()
    {
        this(10);
        System.out.println("Inside default constructor");
    }

    public Demo(int A)
    {
        this(10, 20);
        this.i =A;
        System.out.println(i);
    }

    public Demo(int A,int B)
    {
        this.i = A;
        this.j = B;
        System.out.println(i+" "+j+" ");
    }
}

public class ConstructorChaining 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
    }
}