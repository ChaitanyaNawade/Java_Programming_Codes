class Demo
{
    public int Addition(int A,int B)                   
    {
        return A+B;
    }

    public int Addition(int A,int B,int C)             
    {
        return A+B+C;
    }

    public float Addition(float A,float B)
    {
        return A+B;
    }

    public float Addition(float A,double B)
    {
        return A+(float)B;                    //here we done typecast
    }
    
    public float Addition(double B,float A)
    {
        return A+(float)B;                   //here again we done typecast
    }  

    public double Addition(double A,double B)                  
    {
        return A+B;
    }
}
class MethodOverloading
{
    public static void main(String A[])    
    {    
        Demo dobj = new Demo();   
        System.out.println(dobj.Addition(10, 121)); 
        System.out.println(dobj.Addition(10,20,30)); 
        System.out.println(dobj.Addition(10.10f, 20.22f)); 
        System.out.println(dobj.Addition(10.22f, 20.00f));   
        System.out.println(dobj.Addition(234.000f, 10.25f));    
        System.out.println(dobj.Addition(10.444, 20.454));     
    }
}