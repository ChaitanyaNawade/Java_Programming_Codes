//This code describe the one class can implements the one interface
import java.io.*;

interface Demo 
{
    int Addition(int No1 , int No2);
}

class Hello implements Demo
{
    public int Addition(int No1,int No2)
    {
        int Ans = No1 + No2;
        return Ans;
    }
}

class InterFaceDemo3
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number :");
        int Value1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter the second numbr :");
        int Value2 = Integer.parseInt(bobj.readLine());

        Hello hobj = new Hello();
        System.out.println(hobj.Addition(Value1, Value2));
    }
}