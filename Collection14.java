import java.util.ArrayList;
import java.util.Iterator;

import java.util.*; 

class Collection14 
{
    public static void main(String A[])
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mosambi");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("guava");
        fruits.add("Pomogrenate");


        Iterator<String> itr = fruits.iterator();

        while(itr.hasNext())
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