/* WAP TO PRINT HAPPY NUMBERS BETWEEN A SPECIFIC RANGE.
   Happy Number are positive non-zero integer numbers. If we find the sum of the squares of its every digit and repeat that 
   process until the number will be equals to 1(one). Otherwise, it is called Unhappy Number or Sad Number.
   The examples of Happy Numbers are: 1, 7, 10, 13, 19, 23, 28, 31, 32, etc.

Logic Behind Happy Numbers in Java:

Example: 23 is a Happy Number or Not.	               Example: 11 is a Happy Number or Not.
Step1: 2^2 + 3^2 = 13	                               Step1: 1^2 + 1^2 = 2
Step2: 1^2 + 3^2 = 10	                               Step2: 2^2 = 4
Step3: 1^2 + 0^2 =1	
Output: 1(one), So 23 is a Happy number.	       Output: 4(four), So 11 is an Unhappy number.
*/
import java.util.*;
class happy
{
    public static void main()
    {
        int sum=0,n1=0,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter lower limit and upper limit");    
        int a = sc.nextInt();
        int b = sc.nextInt();
        happy ob = new happy(); 
        System.out.println(" Happy Numbers between "+ a +" and "+b + " are : ");
        for(int i=a;i<=b;i++)
        {
            n1=i;
            for(int j=1;j<=60;j++)
            {
                if(sum==1)
                {
                    System.out.print(i+" "); 
                    break;
                }
                else
                {  sum = 0;
                   while(n1>0)
                    {
                        r = n1 % 10;
                        sum = sum + (r*r);
                        n1 = n1 / 10;
                    }
                   n1 = sum;
                }
            }
            sum=0;
        }
    }
}
/*
 OUTPUT
 Enter lower limit and upper limit
1
100
 Happy Numbers between 1 and 100 are : 
1 7 10 13 19 23 28 31 32 44 49 68 70 79 82 86 91 94 97 100 
 */