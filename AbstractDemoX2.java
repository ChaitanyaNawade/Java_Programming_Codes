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

class AbstractDemoX2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter your division");
        String Option = sobj.next(); 
        
        MSB mobj = null;

        if(Option.equals("Aurangabad"))
        {
          mobj = new Aurangabad();
        }
        else if(Option.equals("Ahmednagar"))
        {
          mobj = new Ahmednagar();
        }
        mobj.DisplayRule();
        mobj.DisplayDate();
    }
}