import java.util.*;

class Collection16 
{
    public static void main(String A[])
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        list.addFirst(07);
        list.addLast(60);

        System.out.println("////////___________________//////////");
        System.out.println("Output using the loop");
        System.out.println(list);
        System.out.println(list.get(2));


        System.out.println("////////___________________//////////");
        System.out.println("Output using for each loop");

        for(int i : list)
        {
            System.out.println(i);
        }

        System.out.println("////////___________________//////////");
        System.out.println("Output using while loop");

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            int Num = itr.next();
            if(Num == 20)
            {
             itr.remove();
            }
        }
        System.out.println("list after removing the 20 "+list);

        System.out.println("////////___________________//////////");
        System.out.println("Output using for loop");

        int i = 0;
        for(i = 0 ; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}