class StringDemo3
{
    public static void main(String A[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");

        char Arr[] = {'H','e','l','l','o'};

        String s3 = new String(Arr); // array to string

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(Arr.length); // property ahe tyamule braces nahi


    }
}