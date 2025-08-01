
interface Demo 
{
    int Addition(int No1,int No2);
}

interface Hello extends Demo 
{
    int Addition(int No1,int No2,int No3);
}

class Arithmatic implements Hello
{
    public int Addition(int No1,int No2)
    {
        int Ans = No1 + No2 ;
        return Ans;
    }

    public int Addition(int No1,int No2,int No3)
    {
        int Ans = No1 + No2 + No3;
        return Ans;
    }
}

class InterFaceDemo2
{
    public static  void main(String A[])
    {
        Arithmatic aobj = new Arithmatic();
        System.out.println(aobj.Addition(55,10));
        System.out.println(aobj.Addition(11, 21, 51));
    }
}