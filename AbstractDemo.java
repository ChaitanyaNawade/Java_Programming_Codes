import java.util.Scanner;

abstract class RBI
{
    public String Country = "India";

    public void DisplayKYC()
    {
        System.out.println("please submit your photo id proof");
    }

    abstract public void DisplayROI ();
}

class SBI extends RBI
{
    public void DisplayROI()
    {
        System.out.println("our Rate Of Intrst is 7.5%");
    }
}

class  BOM extends RBI
{
    public void DisplayROI()
    {
        System.out.println("our rate of interest is 8.5%");
    }
}

class AbstractDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please select your bank");
        System.out.println("1 : State bank of India");
        System.out.println("2 : Bank of Maharashtra");

        RBI robj = null;
        int Option = sobj.nextInt();

        if(Option == 1)
        {
            robj = new SBI();
        }
        else if(Option == 2)
        {
            robj = new BOM();
        }

        System.out.println("Country is "+robj.Country);
        robj.DisplayKYC();
        robj.DisplayROI();
    }
}