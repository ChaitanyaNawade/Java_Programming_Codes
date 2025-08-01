
class Demo
{
    public int i;                
    //public final int j = 21;            inline initialization
    //public final int j ; not allowed

    public final int j ;         //final  characteristics  of a class

    public Demo()
    {
        i = 10;
        j = 20;
    }

}



class FinalDemo2
{
    public  static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.i++;
        //dobj.j++;            error
    }
}