import java.util.*;

/////////////////////////////////////////////////////////////////////////////
public class StudentInfo
{
    private int StudentId;
    private String StudnetName;
    Private int Sstandard;
    private int Smarks;

    public StudentInfo(int Sid,String Sname,int Sstand,int marks)
    {
        this.StudentId = Sid;
        this.StudnetName = Sname;
        this.Sstandard = Sstand;
        this.Smarks = marks;
    }


    public int getSid()
    {
        return StudentId;
    }

    public void setSid(int sid)
    {
        this.StudentId = sid;
    }

    public String getSname()
    {
        return StudnetName;
    }

    public void SetSname(String sname)
    {
        this.StudnetName = sname;
    }

    public int getStandard()
    {
        return Smarks;
    }

    public void setStandard(int Standard)
    {
        this.Sstandard = Standard;
    }

    public int getSmarks()
    {
        return Smarks;
    }

    public void setmarks(int marks)
    {
        this.Smarks = marks;
    }


    public  String toString()
    {
        return StudentId+" | "+StudnetName +" | "+" | "+Sstandard+" | "+Smarks;
    }
}// End of StudentInfoClasss 


///////////////////////////////////////////////////////////////////////////////
//
//
///////////////////////////////////////////////////////////////////////////////


public class SchoolService
{

     private ArrayList<StudentInfo> sobj = new ArrayList<>();

/////////////////////////////////////////////////////////////////////////////
     public void AddStudent(Student s)
     {
        StudentInfo.add(s);
        System.out.println("Student Added Successfully");
     }
 ////////////////////////////////////////////////////////////////////////////


 //////////////////////////////////////////////////////////////////////////
     public void ShowStudnets()
     {
        if(StudentInfo.isEmpty())
        {
            System.out.println("No Studets found");
            return;
        }
        else
        {
            for(Student s:StudentInfo)
            {
                System.out.println(s);
            }
        }
     }
/////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////

public int SearchStudent(int id)
{
    for(studnet s : StudentInfo)
    {
        if(s.getSid == id)
        {
            return s;
        }
    }
    return null;
}

}
/////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////



class JavaProject2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iChoice = 0 , iSid = 0,iSstandard = 0,iSmarks = 0;
        String Sname = 
    }
}