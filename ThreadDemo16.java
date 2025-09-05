class Demo extends Thread 
{
    public void run()
    {
        System.out.println("Inside the Run");
    }
}

class ThreadDemo16 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.start();
        String name  = Thread.currentThread().getName();
        System.out.println(name);
    }
}