import java.util.*;

class Collection15 
{
    public static void main(String A[])
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("Barberry");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("guava");

        Iterator<String> itr = fruits.iterator();

        System.out.println("We are removing the names of fruits which statrted with b ");
        while(itr.hasNext())
        {
            String fruit = itr.next();
            if(fruit.charAt(0) == 'B' || fruit.charAt(0) =='b')
            {
                itr.remove();
            }
        }
        System.out.println(fruits);

        System.out.println("We are removing the names of fruits which ends with a ");

        itr = fruits.iterator();
        
        while (itr.hasNext()) 
        {
            String fruit1 = itr.next();
            if(fruit1.charAt(fruit1.length()-1) == 'a')
            {
                itr.remove();
            }
        }

        System.out.println(fruits);
    }
}