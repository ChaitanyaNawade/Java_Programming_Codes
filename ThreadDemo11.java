
class Demo implements Runnable
{
    public void run()
    {
        int iNo = 10;
        if(iNo % 2 == 0)
        {
            System.out.println("The number is even : "+iNo);
        }
        else 
        {
            System.out.println("The number is odd  : "+iNo);
        }
    }
}


class Demo2 implements Runnable
{
    public void run()
    {
        int iNo = 5;
        if(iNo % 2 != 0)
        {
            System.out.println("The number is odd ");
        }
        else {
            System.out.println("The number is even");
        }
    }
}
class ThreadDemo11
{
    public static void main(String A[]) throws Exception
    {
        Demo dobj = new Demo();
        Demo2 dobj1 = new Demo2();
        Thread tobj1 = new Thread(dobj);
        Thread tobj2 = new Thread(dobj1);

        tobj1.start();
        tobj2.start();
    }
}