// Hcf of two numbers by recursion
import java.util.*;
class hcf_recursion
{
    int num1,num2;
    hcf_recursion()
    {
        num1=0;
        num2 = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter num1 and num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    int gcd(int x,int y)
    {
        if(x<y)
        {
            if(y%x==0)
                return x;
            else
                return gcd(y%x,x);
        }
        else 
        {
            if(x%y==0)
                return y;
            else
                return gcd(y,x%y);
        }
    }

    void display()
    {
        int k = gcd(num1,num2);
        System.out.println("Hcf = " + k);
    }

    public static void main()
    {
        hcf_recursion ob = new hcf_recursion();
        ob.accept();
        ob.display();
    }
}
/*
 OUTPUT
 Enter num1 and num2
16
24
Hcf = 8
 Enter num1 and num2
24
16
Hcf = 8
 Enter num1 and num2
15
10
Hcf = 5
 Enter num1 and num2
24
16
Hcf = 8

 */