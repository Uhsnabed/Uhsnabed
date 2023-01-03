/*  WAP TO CHECK WHETHER THE INPUT NUMBER IS DISARIUM OR NOT
 Eg = 135 =  1 ^1 + 3 ^ 2 + 5 ^ 3
 Output --> 135 is a Disarium Number
 */
import java.util.*;
class Disarium
{
    static int num,size;
    Disarium(int nn)
    {
        num=nn;
        size=0;
        
    }

    void countDigit()
    {  int n1 = 0;
        n1 = num;
        while(n1>0)
        {
            int r = n1 % 10;
            size = size + 1;
            n1 = n1 / 10;
        }
    }

    int sumofDigits(int n , int p)
    {
       if (p<1)
       return 1;
       else
       {
           return( n * (sumofDigits(n,p-1)));
       }
    }

    void check()
    {  int sum = 0;
        int n2 = num;
        while(n2>0)
        {
            int r = n2%10;
            int k = sumofDigits(r,size);
            sum = sum + k;
            size = size - 1;
            n2 = n2 /10;
        }
        if (sum==num)
            System.out.println(num+" is a Disarium Number ");
        else
            System.out.println(num+" is not a Disarium Number ");
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number to check whether it is Disarium Number or not ");
        num = sc.nextInt();
        Disarium ob = new Disarium(num);
        ob.countDigit();
        ob.check();
    }
}
/*
 OUTPUT
  Enter number to check whether it is Disarium Number or not 
135
135 is a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
136
136 is not a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
89
89 is a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
518
518 is a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
4543
4543 is not a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
519
519 is not a Disarium Number 
 Enter number to check whether it is Disarium Number or not 
 */