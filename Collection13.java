import java.util.ArrayList;
import java.util.Iterator;

class Collection13 
{
    public static void main(String A[])
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("Apple");
        fruits.add("Mosambi");
        fruits.add("Orange");
        fruits.add("Pomegranete");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext())
        {
            String fruit = itr.next();
            if(fruit.equals("Apple"))
            {
                itr.remove();
            }
        }

        System.out.println(fruits);
    }
}