import java.io.*;

class Demo implements Runnable 
{
    int iNo = 0;

    Demo(int no)
    {
        this.iNo = no;
    }

    public void run()
    {
        if(iNo % 2 == 0)
        {
            System.out.println("the no is even");
        }
        else 
        {
            System.out.println("The no is odd");
        }
    }
}

class Demo1 implements Runnable 
{
    int iNo = 0;

    Demo1(int no)
    {
        this.iNo = no;
    }

    public void run()
    {
        if(iNo % 2 != 0)
        {
            System.out.println("The no is oddd");

        }
        else 
        {
            System.out.println("The no is even");
        }
    }
}
class ThreadDemo12
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the no");

        int iValue1 = Integer.parseInt(bobj.readLine());
        
        Demo dobj = new Demo(iValue1);

        System.out.println("Enter the no");

        int iValue2 = Integer.parseInt(bobj.readLine());

        Demo1 dobj1 = new Demo1(iValue2);


       Thread tobj1 = new Thread(dobj);
       Thread tobj2 = new Thread(dobj1);

       tobj1.start();
       tobj2.start();

    }
}