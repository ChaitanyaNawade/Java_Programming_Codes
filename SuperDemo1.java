class Base 
{
    int no ;
    String mail;
    public Base(int no, String mail)
    {
        this.no = no;
        this.mail = mail;
    }
    
    public void DisplayBase()
    {
        System.out.println("The no : "+no);
        System.out.println("mail : "+mail);
    }
}


class Derived extends Base
{
    int id;
    String PRN;

    public Derived(int id,String PRN)
    {
        super(10, "woijhfs757");
        this.id = id;
        this.PRN = PRN;
    }

    public void DisplayDerived()
    {
        System.out.println("id : "+id);
        System.out.println("PRN : "+PRN);
    }
}

class SuperDemo1 
{
    public static void main(String A[])
    {
        Derived dobj = new Derived(25, "ajljsfof7575");

        dobj.DisplayBase();
        dobj.DisplayDerived();
    }
}