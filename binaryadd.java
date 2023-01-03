//# WAP TO FIND BINARY SUM OF TWO NUMBERS TAKEN INPUT.
import java.util.*;
class binaryadd
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        String n1 = sc.next();  //# taking input two numbers
        String n2 = sc.next();
        int carry = 0, z=0;
        String zs = ""; 
        int c = n1.length()-1;
        while(c>=0)
        {   z = 0; 
            char ch1 = n1.charAt(c);   //# extracting each digit of n1 from right side
            char ch2 = n2.charAt(c);   //# extracting each digit of n2 from right side 
            c = c-1;  //# couter variable to run the while loop until the last digit of n1 and n2
            int r1 = Character.getNumericValue(ch1);
            int r2 = Character.getNumericValue(ch2);
            if((r1+r2)>1)
            {
                z = z + carry;
                zs = zs + z;
                carry= carry +1;
                if(carry>=2)
                    carry= carry -1 ;
            }
            else
            {
                if(r1==0 && r2==0)
                {z = z + r1 + r2 + carry;}
                else if(r1==0 && r2==1 || r1==1 && r2==0)
                {
                    if(carry==1)
                  {  z = z + r1 + r2 + carry-2;
                    carry++;}
                    else
                     z = z + r1 + r2 + carry;
                }
                if(z>1)
                    z=z-1;
                zs = zs + z;
                if(carry>=1)
                    carry= carry -1;
            }
            if((c==-1) && carry==1)
                zs = zs + '1';
        }   //# zs stores reverse of the binary addition
        StringBuffer sb = new StringBuffer(zs);
        StringBuffer m = sb.reverse();   //# reversing zs to find the binary sum
        System.out.println("Binary addition:");
        System.out.println(m);
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
01111

 */