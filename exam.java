class exam
{
    public static void main()
    {
        String s = "TRAIN"; String nw = "";
        for(int i = 0 ; i < s.length(); i ++)
        {
            char ch1 = s.charAt(i);
            int k = ch1 + i + 1;
            char ch2 = (char)k;
            nw = nw + ch2;
        }
        System.out.println(nw);
        
        
    }
}