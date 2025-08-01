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
 if((this.Marks == obj.Marks) && ((this.name).equals(obj.name))) //string has its own equals method named as .equals
 {
  return true;
 }
 else
 {
    return false;
 }
  
}
  
}

class ObjectDemo4
{
    public static void main(String A[]) 
    {
    Student sobj1 = new Student("sagar",11,89);
       //use of objcet 
    Student sobj2 = new Student("pooja",11,89);
    // System.out.println(sobj1.equals(sobj2));  
    if(sobj1.equals(sobj2) == true)
    {
        System.out.println("Objects are equals");
    }
    else
    {
        System.out.println("Objects are ifferent");
    }

    }
}