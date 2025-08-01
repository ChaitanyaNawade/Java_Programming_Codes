import java.util.Scanner;
abstract class MSB
{
    public void DisplayRule()
    {
        System.out.println("Please provide your exam date early");
    }

    abstract public void DisplayDate();
}

class Aurangabad extends MSB
{
    public void DisplayDate()
    {
        System.out.println("we are going to take exam in March");
    }
}

class Ahmednagar extends MSB
{
    public void DisplayDate()
    {
        System.out.println("we are going to take the exam in may");
    }
}
class AbstractDemoX 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("please choose option");
        System.out.println("1 : for Aurangabad");
        System.out.println("2 : for Ahmednagar");
        int Option = sobj.nextInt(); 
        MSB mobj = null; 

        if(Option == 1)
        {
            mobj = new Aurangabad();
        }
        else if(Option == 2)
        {
            mobj = new Ahmednagar(); 
        }
        mobj.DisplayRule();
        mobj.DisplayDate();
    }
}