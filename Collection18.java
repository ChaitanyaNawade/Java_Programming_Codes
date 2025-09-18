import java.util.*;

class Collection18 
{
    public static void main(String A[])
    {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("lichi");
        fruits.add("Anar");
        fruits.add("Apple");

        System.out.println(fruits);

        Iterator<String> list = fruits.iterator();

        while(list.hasNext())
        {
            String name = list.next();
            if(name.charAt(0) == 'a' || name.charAt(0) == 'A')
            {
                list.remove();
            }
        }

        System.out.println("The updated Linkedlist is ");
        System.out.println(fruits);
    }
}