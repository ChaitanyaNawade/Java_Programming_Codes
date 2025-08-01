class Demo
{
    public int i,j;

     public Demo()
    {  
        System.out.println("Inside defaultconstructor");
        this.i=0;
        this.j=0;
    }

     public Demo(int a,int b)
    {  
        System.out.println("Inside parametrizedconstructor");
        this.i=a;
        this.j=b;
    }

    protected void finalize()
    {
          System.out.println("inside finalize method");
    }
}

class ConstructorDemo
{
    public static void main(String A[])
    { 
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(11,21);

        obj1=null;
        obj2=null;
        System.gc();

    }
}