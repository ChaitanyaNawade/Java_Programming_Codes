abstract class ECI
{
    public void Display()
    {
        System.out.println("Please provide the date of election");
    }

    abstract void StateDate();
}

class UP extends ECI 
{
    @Override
    void StateDate()
    {
        System.out.println("we are going to take election in may month");
    }
}

class Bihar extends ECI 
{
    @Override
    void StateDate()
    {
        System.out.println("We are going to take election in august month");
    }
}

public class AbstractDemoX4
{
    public static void main(String A[])
    {
        UP uobj = new UP();
        Bihar bobj = new Bihar();

        uobj.Display();
        uobj.StateDate();
        bobj.StateDate();
    }
}