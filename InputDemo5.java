import java.io.*;

class InputDemo5 {
    public static void main(String A[])
    {
         BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

         int No1 = 0;
         int No2 = 0;
         int Ans = 0;
         try 
         {
            System.out.println("Enter the first number");
            No1  = Integer.parseInt(bobj.readLine());
            System.out.println("Enter the second number");
            No2 = Integer.parseInt(bobj.readLine());
            Ans = No1 + No2;
         }
         catch( IOException iobj)
         {
            System.out.println("inside the catch block");   
         }

         System.out.println(Ans);
    }
}