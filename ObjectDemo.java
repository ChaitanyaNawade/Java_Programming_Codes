class Demo
{
    public int i,j;

    Demo()
    {  
       // i= 10;  these values i initialized with the help of constructor
       // j= 20;

    //    i = 0;
    //    j = 0;
        System.out.println("Inside constructor");
    }

    Demo(int a,int b)
    {
         i = a;
         j = b;
    }
}

class ObjectDemo
{
    public static void main(String A[])
    { 
        Demo obj = new Demo(10,20);
        System.out.println("The value of i is :"+obj.i);
    }
}