import java.util.*;

public class Collection10 
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Numbers from the list is : "+list);

        list.remove(1);

        System.out.println("Updated list is : "+list);


        System.out.println("using for each loop printed list is : ");


        System.out.print("elements from the list is : ");
        for(int i :list)
        {
            System.out.println(i);  
        }
    }
}