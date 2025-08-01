class Arithmatic
{
    Arithmatic()
    {
        int no1=0;
        int no2=0;
    }

    Arithmatic(int a ,int b)
    {
        no1=a;
        no2=b;
    }

    int Addition()
    {
        int ret=0;
        ret = a+b;
        return ret;
    }
}


class Hello
{
    public static void main(String A[])
    {
          Arithmatic obj = new Arithmatic();
          obj.Addition();

          int ans = 0;
          ans = Addition(10,20);

          System.out.println("The addition is "+ans);

          
    }
}