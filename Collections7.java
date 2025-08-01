import java.util.*;
class Collections7
{
    public static void main(String A[])
    {
        Stack <String>  sobj = new Stack <String> ();


    sobj.push("Demo");
    sobj.push("Hello");
    sobj.push("lb");
    sobj.push("python");
    sobj.push("PPA");

    System.out.println(sobj);  
    System.out.println(sobj.size());

    System.out.println(sobj.pop());

    System.out.println(sobj);
    System.out.println(sobj.size());

    System.out.println(sobj.peek());


    Iterator iobj = sobj.iterator();

    while(iobj.hasNext())
    {
        System.out.println(iobj.next());
    }

    sobj.clear();


        
    }
}