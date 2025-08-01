class Student
{
    public String name;
    public int Rno;
    public int Marks;

    public Student(String str,int A,int B)
    {
        System.out.println("Inside Constructor");
        this.name = str;
        this.Rno  = A;
        this.Marks = B;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class ObjectDemo1
{
    public static void main(String A[])
    {
       Student sobj = new Student("sagar",11,89);
       //use of objcet 
       sobj = null;
       System.gc();
    }
}