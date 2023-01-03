// hcf of two numbers
import java.util.*;
class hcf
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        if (a<b)
        {
            while(true)
            {
                c=b%a;
                if(c==0)
                break;
                b=a;a=c;
            }
            System.out.println( " Hcf = "+ a);
        }
        if (a>b)
        {
            while(true)
            {
              c=a%b;
                if(c==0)
                break;
               a=b;b=c;
            }
            System.out.println( " Hcf = "+ b);
        }  
            
        }
    }

/*
Enter a and b 
24
36
 Hcf = 12
 Enter a and b 
10
15
 Hcf = 5
 Enter a and b 
16
24
 Hcf = 8
 Enter a and b 
36
24
 Hcf = 12
 Enter a and b 
24
16
 Hcf = 8

 */