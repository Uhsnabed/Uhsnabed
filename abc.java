// TO CONVERT THE FIRST CHARACTER AND LAST CHARACTER OF A SENTENCE TO ITS OPPOSITE CASE
import java.util.*;
class abc
{  String s; int l ; String nwsent;
    abc()
    {
        s = ""; l=0; nwsent= "";
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        s = sc.nextLine();
        s = s.trim(); s = s + " "; l = s.length();
    }

    void perform()
    {   String w = "",w1 ="";
        for(int i = 0;i<l;i++)
        {
            char ch1 = s.charAt(i);
            if(ch1!=' ')
                w =w + ch1;
            else
            { int l2 = w.length();
                char ch2 = w.charAt(0); char ch3 = w.charAt(l2-1);
                int a = ch2; int b = ch3;
                if(a>=65 && a<=90)
                    ch2 = Character.toLowerCase(ch2);
                if(a>=97 && a<=122)
                    ch2 = Character.toUpperCase(ch2);
                if(b>=65 && b<=90)
                    ch3 = Character.toLowerCase(ch3);
                if(b>=97 && b<=122)
                    ch3 = Character.toUpperCase(ch3);
                w1 = ch2 + w.substring(1,l2-1) + ch3;
                nwsent = nwsent + w1 + " " ;
                w= ""; w1 ="";
            }
        }
    }

    void print()
    {
        System.out.println("Original sentence "+s);
        System.out.println("Edited sentence " + nwsent);
    }

    public static void main()
    {
        abc ob = new abc();
        ob.input();
        ob.perform();
        ob.print();
    }
}
/**
OUTPUT
Enter a string 
The suN RiISes In thE eaST
Original sentence The suN RiISes In thE eaST 
Edited sentence thE Sun riISeS iN The EaSt 
 */