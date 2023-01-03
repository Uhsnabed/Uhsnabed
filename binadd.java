//# WAP TO FIND BINARY SUM OF TWO NUMBERS TAKEN INPUT.
import java.util.*;
class binadd
{
    long n1,n2;
    long k3;
    binadd()
    {
        n1=0;n2=0;
        k3=0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextLong();  //# taking input two numbers
        n2 = sc.nextLong();
    }

    long blongodeci(long n)
    {
        long sum = 0 ; long c = 0;
        while(n>0)
        {
            long r = n%10;
            sum = (long)(sum + Math.pow(2,c)*r);
            c++;
            n=n/10;
        }
        return sum;
    }

    long add()
    {
        long k1 = blongodeci(n1);
        long k2 = blongodeci(n2);
        k3 = k1+k2;
        return k3;
    }

    String decitobin(long l)
    {
        String s ="", s1="";
        while(l>0)
        {
            if(l%2==0)
                s = s + '0';
            else
                s = s +'1';
            l = l /2;
        }
        StringBuffer sb = new StringBuffer(s);
        StringBuffer m = sb.reverse(); 
        s1 = sb.toString();
        return (s1);
    }

    public static void main()
    {
        binadd ob = new binadd();
        ob.input();
        long d = ob.add();
        String dd = ob.decitobin(d);
        System.out.println(" Binary sum = " + dd);
    }
}
/**
 OUTPUT
 Enter two numbers
1111
1010
Binary addition:
11001
Enter two numbers
1011
1010
Binary addition:
10101
Enter two numbers
10101010
11001100
Binary addition:
101110110
Enter two numbers
101011100110
111010110101
Binary addition:
1100110011011
Enter two numbers
01010
00101
Binary addition:
1111
 */