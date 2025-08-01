import java.lang.*;

class Demo implements Runnable 
{
    public void run()
    {
        int i = 0;
        for(i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception obj)
            {

            } 
        }
    }
}
class ThreadDemo9
{
    public static void main(String A[]) throws Exception
    {
        Demo dobj = new Demo();
        Thread tobj1 = new Thread(dobj);
        Thread tobj2 = new Thread(dobj);

        // dobj.run();

        tobj1.setName("A");
        tobj2.setName("B");

        tobj1.start();
        tobj2.start();
    }
}