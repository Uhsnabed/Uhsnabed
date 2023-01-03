import java.util.*;
class Binary
{
    static String bin,num;
    Binary()
    {
        bin = ""; num = "";
    }
    String binary(int n)
    {
       if(n>0)
       {
           if(n%2==0)
           bin = '0' + bin;
           else
           bin = '1' + bin;
           return binary(n/2);
       }
       else
       return bin;
    }
    void display()
    {
        System.out.println("Decimal Number: "+ num);
        String d = binary(Integer.parseInt(num));
        System.out.println("Binary equivalent:"+ d);
    }
    public static void main()
    {
       Binary ob = new Binary();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter decimal number");
       num = sc.next();
       ob.display();
    }
}
/**
 OUTPUT
 Enter decimal number
8754
Decimal Number: 8754
Binary equivalent:10001000110010

 */