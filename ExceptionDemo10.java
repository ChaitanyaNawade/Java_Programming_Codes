import java.util.*;

class FailedException extends  Exception
{
    public FailedException(String str)
    {
        super(str);
    }
}

class Demo 
{
    public int marks;

    public Demo(int marks)
    {
        this.marks = marks;
    }

    public void CheckResult() throws  FailedException
    {
        if(marks < 50)
        {
            throw new FailedException("you are not elegible for the next round");
        }
        else 
        {
            System.out.println("you are elegible for the next rouund");
        }
    }
}

class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);


        System.out.println("Enter the marks of the student");

        int marks = sobj.nextInt();

        Demo dobj =  new Demo(marks);

        try 
        {
            dobj.CheckResult();
        }
        catch(FailedException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception eobj)
        {

        }
        
    }
}