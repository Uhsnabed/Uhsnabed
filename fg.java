class fg
{
    public static void main()
    {
        /*char ch1 = 'A' ; char ch2 = 'B';
        String s = "INDIA";
        s = ch1 + "" + ch2;
        System.out.println(s); */
        String s1 = "hello there"; String nw = "";
        for(int i =0;i<s1.length()-1;i+=2)
        {
            char ch = s1.charAt(i);
            char chh = s1.charAt(i+1);
            nw = nw + chh + ch;
        }
        if(s1.length()%2!=0)
        nw = nw + s1.charAt(s1.length()-1);
        System.out.println(s1 + " "+ nw);
    }
}