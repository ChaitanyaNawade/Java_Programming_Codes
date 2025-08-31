abstract class RBI
{
    abstract void DisplayROI();
    void DisplayKYC()
    {
        System.out.println("Please submit your Adhar Id Proof and photo to kyc");
    }
}

class SBI extends RBI
{
    void DisplayROI()
    {
        System.out.println("Our ROI is 7.5%");
    }
}

class BOM extends RBI
{
    void DisplayROI()
    {
        System.out.println("Our ROI is 8.5%");
    }
}

class AbstractDemoX3
{
    public static void main(String A[])
    {
        SBI sobj = new SBI();
        BOM bobj = new BOM();
        sobj.DisplayKYC();
        sobj.DisplayROI();
        bobj.DisplayROI();
    }
}