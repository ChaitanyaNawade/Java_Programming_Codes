class Demo extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadDemo17 
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        System.out.println("inside the main");
        dobj1.setName("high");
        dobj2.setName("low");

        dobj1.start();
        dobj2.start();
    }
}