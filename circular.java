class circular
{
    public static void main()
    {
        String s = "1193";
        for(int i = 0;i<s.length(); i++)
        {
        System.out.println(s);
        String s1 = s.substring(1,s.length());
        String s2 = s1 + s.charAt(0);
        s = s2;
    }
    }
}
/**
 OUTPUT
 1193
1931
9311
3119
*/