import java.util.*;
class blank
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch[];
        ch = new char[10];
        ch[0] = '\u0000';
        /*for(int i=0;i<5;i++)
        {
            ch[i] = sc.next().charAt(0);
        }*/
        for(int i=0;i<5;i++)
        {
            System.out.println(ch[i]);
        }
    }
}