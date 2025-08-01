import java.io.*;

interface Circle
{
    float PI = 3.14f;

    float CalculateArea(float Radius);
    float CalculateCircumfarence(float Radius);

    default void Display()
    {
        System.out.println("Inside the interface");
    }
}

class Marvellous implements Circle
{
    
    public float CalculateArea(float Radius)
    {
        float Area = 0.0f;
        Area = PI * Radius * Radius;
        return Area;
    }
     

    public float CalculateCircumfarence(float Radius)
    {
        float Circumfarence = 0.0f;
        Circumfarence = 2 * PI * Radius;
        return Circumfarence;
    }

    public void Displayx()
    {
        System.out.println("insdie the display lf marvellous");
    }
}

class InterFaceDemo1
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        //Every characteristic is by default public static and final..
        System.out.println("the value of PI is : "+Circle.PI);

        //this generate error because it is final by default
        //Circle.PI = 7.10f; error due to final 

        System.out.println("Enter Radius");
        float Value = Float.parseFloat(bobj.readLine()); //Readline is used to read data in string and read is used to get the data as char

        Marvellous mobj = new Marvellous();

        System.out.println("Area is : "+mobj.CalculateArea(Value));

        System.out.println("Circumfarence is : "+mobj.CalculateCircumfarence(Value));

        mobj.Displayx();

        mobj.Display();
    }
}