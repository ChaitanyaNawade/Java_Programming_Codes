import java.lang.Thread;


class Demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadDemo4
{
    public static void main(String A[])
    {
        System.out.println("Inside the main Thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setName("first");   
        obj2.setName("second");

        obj1.start();
        obj2.start();
    }
}