class Student 
{
    int id;

    String mail;

    String PRNNO;

    University University;


    Student(int A,String B,String C,University D)
    {
        this.id = A;
        this.mail = B;
        this.PRNNO = C;
        this.University = D;
    }


    public void Display()
    {
        System.out.println("Id : "+id);
        System.out.println("mail : "+mail);
        System.out.println("PRNNO : "+PRNNO);
        System.out.println("UNIVERSITY : "+University);
        University.DisplayUniversity();
    }
}

class University 
{
    String Course;

    String Faculty;
    
    University(String A,String B)
    {
        this.Course = A;
        this.Faculty = B;
    }
    
    public void DisplayUniversity()
    {
        System.out.println("Course : "+Course);
        System.out.println("Faculty : "+Faculty);
    }
}

class HasA1 
{
    public static void main(String A[])
    {
       University uobj = new University("BE", "IT");

       Student sobj = new Student(11, "aksjs55558", "ksjioiogs555", uobj);

       sobj.Display();
    }
}