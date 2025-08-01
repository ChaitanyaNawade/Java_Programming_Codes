import java.util.*;
class Input
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in); //connected to the keyboard using the system.in
        int no1=0, no2=0, ans=0;
        System.out.println("Enter first number :");
        no1= sobj.nextInt();

        System.out.println("Enter the second number");
        no2 = sobj.nextInt();

        ans= no1+no2;
        System.out.println("Addition is :"+ans);
    }
}

/*
      primitive datatypes              mehtod(Scanner class)
      boolean                             nextBoolean()
      byte                                nextByte()
      char                                ----
      short                               nextShort()
      int                                 nextIngt()
      float                               nextFloat()
      double                              nextDouble()
      long                                nextLong()
 */