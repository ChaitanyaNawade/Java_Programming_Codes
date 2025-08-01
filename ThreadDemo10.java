 class Demo implements Runnable
 {
    public void run()
    {
        char ch = 'A';
        int iNo = 10;
        System.out.println("The character is : "+Thread.currentThread().getName()+" "+ch);
         try
        {
            Thread.sleep(5000);
        }
        catch(Exception eobj)
        {

        }
        System.out.println("The number is :"+Thread.currentThread().getName()+" "+iNo);
       
    }
 }

 class ThreadDemo10
 {
    public static void main(String A[]) throws Exception
    {
        Demo dobj = new Demo();
        Thread tobj1 = new Thread(dobj);
        Thread tobj2 = new Thread(dobj);

        tobj1.setName("A");
        tobj2.setName("B");

        tobj1.start();
        tobj2.start();
    }
 }