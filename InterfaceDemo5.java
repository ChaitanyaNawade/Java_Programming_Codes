interface Circle 
{
    float PI = 3.14f;

    float CalculateArea(float Radius);
    float CalculateCircumfarence(float Radius);
}

class Derived implements Circle
{
    public float CalculateArea(float Radius)
    {
        float Area = 0.0f;
        Area = PI * Radius * Radius;
        return Area;
    }

    public float CalculateCircumfarence(float Radius)
    {
        float Circumfarence  = 0.0f;
        Circumfarence = PI * PI * Radius;
        return Circumfarence;
    }
}

class  InterfaceDemo5 
{
    public static void main(String A[])
    {
        float fRet = 0.0f;
        Derived dobj = new Derived();
        System.out.println("The Area is : "+dobj.CalculateArea(10.5f));
        System.out.println("The circumference is : "+dobj.CalculateCircumfarence(20.40f));
    }
}