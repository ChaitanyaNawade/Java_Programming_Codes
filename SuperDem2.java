import java.io.*;

class Base 
{
    public int i;
    public int j;


    public Base(int A,int B)
    {
        this.i = A;
        this.j = B;
    }


    public void Show()
    {
        System.out.println("inside the show of Base class");
        System.out.println("The value of i in Base is : "+i);
        System.out.println("The value of j in Base is : "+j);
    }
}


class Derived extends Base 
{
    public int i , j;

    public Derived(int A,int B)
    {
        super(10,11);
        this.i = A;
        this.j = B;
    }

    public void Show()
    {
        super.Show();
        System.out.println("Inside the show of Derived");
        System.out.println("The value of i inside the Derived class is : "+i);
        System.out.println("The value of j inside the Derived class is : "+j);
    }
}

class SuperDem2
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        int no1 = 0;
        int no2 = 0;

        try
        {
        System.out.println("Enter the first number");
        no1 = Integer.parseInt(bobj.readLine());
        System.out.println("Enter the Second number"); 
        no2 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException iboj)
        {
            System.out.println("Inside the catch block");
        }
       
        Derived dobj = new Derived(no1,no2);
        dobj.Show();
    }
}