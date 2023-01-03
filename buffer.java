class buffer
{
    public static void main()
    {
        
    String s = "KOLKATA";
StringBuffer sb = new StringBuffer(s);
StringBuffer m = sb.reverse();
System.out.println(m);
System.out.println(sb);  // since reverse gets stored in sb
}
}
