import java.util.*;

class Collection17 
{
    public static void main(String A[])
    {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Lemon");

        Iterator<String> itr = fruits.iterator();

        while(itr.hasNext())
        {
            String name = itr.next();
            if(name.equals("Guava"))
            {
                itr.remove();
            }
        }

        System.out.println("The updated linkedlist is : "+fruits);
    }
}