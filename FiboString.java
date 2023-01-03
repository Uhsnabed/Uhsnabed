import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    FiboString()
    {
        x="a";
        y= "b";
        z="-ba";
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TERMS ");
        n = sc.nextInt();
    }

    void generate()
    {
        System.out.print(x+",");
        System.out.print(y+",");
        for(int i=3;i<=n;i++)
        {
            z = y+x;
            if(i==n)
            {System.out.print(z);}
            else
            {System.out.print(z+",");}
            x=y;
            y=z;
        }
    }

    public static void main()
    {
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}
/*
OUTPUT
ENTER NUMBER OF TERMS 
6
a,b,ba,bab,babba,babbabab
 */