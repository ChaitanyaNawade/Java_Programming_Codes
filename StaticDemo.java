class Demo
{
    public int i,j;               //instance variable
    public static int k;          //class variable

    static                      //static block
    {
        System.out.println("Inside the static block");
        k = 51;
    }

    Demo()
    {
        System.out.println("Inside the constructor");
        i = 11;
        j = 21;
    }   

    public void Fun()                          //instance method
    {
        System.out.println("Inside the Fun");
        System.out.println(i+" "+j+" "+k);
        // System.out.println("j :"+j);
        // System.out.println("k :"+k);
    }


    public static void Gun()                  //class method it can only access the static charachteristics of class
    {
        System.out.println("Inside the Gun");
        System.out.println(k);
    }
}

class StaticDemo
{
    public static void main(String A[])
    {
       System.out.println("Inside main");
       System.out.println(Demo.k);
       Demo.Gun();


       Demo obj1 = new Demo();
       Demo obj2 = new Demo();

       System.out.println(obj1.i+" "+obj1.j);      
       obj1.Fun();
    }
}