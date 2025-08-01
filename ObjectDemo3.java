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
     
    //sobj1.equals(sobj2)
public boolean equals(Student obj)
{
  System.out.println("this.name "+this.name);
   System.out.println("obj.name "+obj.name);
   return true;
}
  
}

class ObjectDemo3
{
    public static void main(String A[]) 
    {
    Student sobj1 = new Student("sagar",11,89);
       //use of objcet 
    Student sobj2 = new Student("pooja",11,89);
    System.out.println(sobj1.equals(sobj2));    
    }
}