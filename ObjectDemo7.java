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
    public String toString()
    {
        return this.name+" "+this.Rno+" "+this.Marks;
    }
}

class ObjectDemo7
{
    public static void main(String A[]) 
    {
         Student sobj1 = new Student("sagar",11,89);
          //use of objcet 
        System.out.println(sobj1.toString());
    }
}