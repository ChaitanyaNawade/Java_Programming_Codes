import java.util.*;
class Collections1
{
    public static void main(String A[])
    {
        int Arr [] = {11,51,21,101,75,95};

        System.out.println(Arr); // 

        int iCnt = 0;
        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
           System.out.println(Arr[iCnt]);
        }

        System.out.println("Data traversal using for-each");
        for(int no: Arr)
        {
            System.out.println(no);
        }
    }
}