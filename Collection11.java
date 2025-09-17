import java.util.*;

class Collection11 
{
    public static void main(String A[])
    {
        ArrayList<String> group = new ArrayList<>();

        group.add("Chaitanya");
        group.add("Aniket");
        group.add("Prashant");
        group.add("Suraj");

        System.out.println("////////////////////////////////////////////////////////////////");

        int i = 0;

        System.out.println("Using for loop ");

        for(i = 0; i < group.size();i++)
        {
            System.out.println(group.get(i));
        }

        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("Output using for each loop");

        for(String name : group)
        {
            System.out.println(name);
        }

       System.out.println("////////////////////////////////////////////////////////////////");

       System.out.println("Using while loop");

       //To use while loop we have to conver first list to iterator using iterator class
       Iterator<String> itr = group.iterator();
       while (itr.hasNext()) 
       {
            System.out.println(itr.next());
       }

        System.out.println("////////////////////////////////////////////////////////////////");

        System.out.println("Using lambda 8 + for each loop");
        
        group.forEach(group1-> System.out.println(group1));

    
    }
}