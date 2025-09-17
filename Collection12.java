// In this Program we used the Iterator interface to traverse the Arraylist
import java.util.*;

class Collection12 
{
    public static void main(String A[])
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("lichi");
        fruits.add("Strawberry");


        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()) 
        {
            String name = itr.next();
            System.out.println(name);
        }
    }
}