//this Program illustrates the concpet of the commad line argument

public class CommandLine
{
    public static  void main(String A[]) //The command is given at the runtime is get copied into A[] array 
    {
        int i = 0;
        System.out.println(A.length);
        // System.out.println(A[0]);
        // System.out.println(A[1]);
        // System.out.println(A[2]);
        

        for(i = 0; i < A.length ; i++)
        {
            System.out.println(A[i]);
        }
        System.out.println();
    }
}
