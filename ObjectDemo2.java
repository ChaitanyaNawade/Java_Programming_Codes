class Student implements Cloneable
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
     
 public Object clone() throws CloneNotSupportedException
 {
    return super.clone();
 }
  
}

class ObjectDemo2
{
    public static void main(String A[]) throws Exception
    {
    Student sobj = new Student("sagar",11,89);
       //use of objcet 
      Student sobjX = (Student)sobj.clone();

      System.out.println(sobj.name+" "+sobj.Rno+" "+sobj.Marks);
      System.out.println(sobjX.name+" "+sobjX.Rno+" "+sobjX.Marks);

      System.out.println(sobj.hashCode());
     System.out.println(sobjX.hashCode());

     System.out.println(sobj.getClass());
     //System.out.println(sobjX.getClass());


      
    }
}