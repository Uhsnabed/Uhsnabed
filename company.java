/** A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 
 * 24 boxes and 48 boxes. Design a program to accept the number of boxes to be packed (N) by the user 
 * (maximum up to 1000 boxes) and display the break-up of the cartons used in descending order of capacity
 * (i.e. preference should be given to the highest capacity available, and if boxes left are less than 6, 
 * an extra carton of capacity 6 should be used.)
Test your program with the following data and some random data:

Example 1
INPUT:
N = 726
OUTPUT:
48 * 15 = 720
6 * 1 = 6
Remaining boxes = 0 
Total number of boxes = 726
Total number of cartons = 16

Example 2
INPUT:
N = 140
OUTPUT:
48 * 2 = 96
24 * 1 = 24
12 * 1 = 12
6 * 1 = 6
Remaining boxes = 2 * 1 = 2
Total number of boxes = 140
Total number of cartons = 6
 */

import java.util.*;
class company
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of boxes to packed(maximum 1000 boxes and minimum 6 boxes)");
        int N = sc.nextInt();
        while(N<6 || N>1000)
        {
            System.out.println("invalid Input! Enter again");
            N = sc.nextInt();
        }
        int a =1,sum=0,sum1=0,sum2=0,sum3=0,c=0;
        int b1 = 1,b2=1,b3=1,b4=1;
        while((N-sum)>=48)
        {
            b1 = b1 + 1;
            sum = 48 * a;
            a = a + 1 ;
        }
        if(b1>1)
        {
            a = a  - 1 ; c = c + a;
            System.out.println("48" + " * " + a + " = " + sum);
        } 
        a = 1;
        while((N-(sum+sum1)>=24))
        {
            b2 = b2 + 1;
            sum1 = 24 * a;
            a = a + 1 ;
        }
        if(b2>1)
        {
            a = a  - 1 ; c = c + a;
            System.out.println("24" + " * " + a + " = " + sum1);
        } 
        a = 1;
        while((N-(sum+sum1+sum2)>=12))
        {
            b3 = b3 + 1;
            sum2 = 12 * a;
            a = a + 1 ;
        }
        if(b3>1)
        {
            a = a  - 1 ; c = c + a;
            System.out.println("12" + " * " + a + " = " + sum2);
        } 
        a = 1;
        while((N-(sum+sum1+sum2+sum3)>=6))
        {
            b4 = b4 + 1;
            sum3 = 6 * a;
            a = a + 1 ;
        }
        if(b4>1)
        {
            a = a  - 1 ; c = c + a;
            System.out.println("6" + " * " + a + " = " + sum3);
        } 
        int remboxes = N - ( sum + sum1 + sum2 + sum3);
        if(remboxes!=0)
            c = c + 1;
        System.out.println("Remaining boxes : " + remboxes);
        System.out.println("Total number of boxes : " + N);
        System.out.println("Total number of cartoons : "+c);
    }
}
/*
OUTPUT 1
Enter number of boxes to packed(maximum 1000 boxes and minimum 6 boxes)
4
invalid Input! Enter again
1003
invalid Input! Enter again
140
48 * 2 = 96
24 * 1 = 24
12 * 1 = 12
6 * 1 = 6
Remaining boxes : 2
Total number of boxes : 140
Total number of cartoons : 6
OUTPUT 2
Enter number of boxes to packed(maximum 1000 boxes and minimum 6 boxes)
76
48 * 1 = 48
24 * 1 = 24
Remaining boxes : 4
Total number of boxes : 76
Total number of cartoons : 3

 */