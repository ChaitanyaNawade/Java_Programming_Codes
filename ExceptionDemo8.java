import  java.util.*;

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String msg)
    {
        super(msg);
    }
}

class Demo 
{
    public int age;

    public Demo(int age)
    {
        this.age = age;
    }

    public void Vote()throws  AgeInvalidException
    {
        if(age < 18)
        {
            throw new AgeInvalidException("Entered invalid age");
        }
        else 
        {
            System.out.println("you are eligible for the voting");
        }
    }
}


class ExceptionDemo8 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        
        int age = sobj.nextInt();

        Demo dobj = new Demo(age);

        try
        {
        dobj.Vote();
        }
        catch(AgeInvalidException i)
        {
            System.out.println(i.getMessage());
        }
    }
}