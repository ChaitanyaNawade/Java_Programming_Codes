class Arithmatic 
{
   public int no1,no2;

   Arithmatic()
   {
    no1 = 0;
    no2 = 0;
   }

   Arithmatic(int a,int b)
   {
    no1 = a;
    no2 = b;
   }

   int Addition()
   {
    int ans = 0;
    ans = no1+no2;
    return ans;
   }

}

class Marvellous
{
    public static void main(String A[])
    {
       Arithmatic aobj = new Arithmatic(11,12);
       int res = 0;
       res = aobj.Addition();

       System.out.println("The addition is : "+res);
    }
}