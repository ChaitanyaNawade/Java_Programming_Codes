import java.util.*;
class Collections3
{
    public static void main(String A[])
    {
        float Arr [] = {11.89f,51.20f,21.11f,101.32f,75.85f,95.45f};

        
        System.out.println("Data traversal using for-each");
        for(float no: Arr)
        {
            System.out.println(no);
        }
        
        Arrays.sort(Arr);
        System.out.println("Data traversal using for-each after sorting");
        for(float no: Arr)
        {
            System.out.println(no);
        }

        int iRet = 0;

        iRet = Arrays.binarySearch(Arr,21.11f);
        System.out.println("Return value of binary search is : "+iRet);

        iRet = Arrays.binarySearch(Arr,121.10f);
        
        if(iRet >= 0)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("There is no such element");
        }
    }
}