class StringDemo5
{
    public static void main(String A[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        if(s1 == s3)
        {
            System.out.println("Strings are equal using ==");
        }
        else
        {
            System.out.println("Strings are not equal using ==");
        }

        if(s1.equals(s3))
        {
            System.out.println("Strings are equal using equals method");
        }
         else
        {
            System.out.println("Strings are not equal using equals method");
        }
    }
}