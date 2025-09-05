class Base
{
    public int id;
    public String mail;
    public String pass;
    Derived Derived;

    Base(int A,String B,String C,Derived Derived)
    {
        this.id = A;
        this.mail = B;
        this.pass = C;
        this.Derived = Derived;
    }

    public void Display()
    {
        System.out.println("id : "+id);
        System.out.println("mail : "+mail);
        System.out.println("pass : "+pass);
        System.out.println("Derived : "+Derived);
        Derived.DisplyDerived();
    }

}

class Derived 
{
    public int no;
    public String Cid;
    public String Duration;

    Derived (int A,String B,String C)
    {
        this.no = A;
        this.Cid = B;
        this.Duration = C;
    }

    public void DisplyDerived()
    {
        System.out.println("no : "+no);
        System.out.println("Cid : "+Cid);
        System.out.println("Duration : "+Duration);
    }
  
}

class HasA 
{
    public static void main(String A[])
    {
        Derived dobj = new Derived(10, "abc", "10.5");
        Base bobj = new Base(10, "abac@gmail.com", "Pass@123", dobj);
        bobj.Display();
    }
}