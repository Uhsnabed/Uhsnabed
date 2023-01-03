import java.util.*;
class count_string
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine(); String w =""; 
        s = s.trim(); s = s + " "; 
        int twoletter = 0 ; int fourletter = 0;
        for(int i = 0 ; i<s.length(); i++)
        {
           char ch1 = s.charAt(i);
           if(ch1!=' ')
           w = w + ch1;
           else
           {
               int l1 = w.length();
               if(l1==2)
               twoletter = twoletter + 1;
               else if(l1==4)
               fourletter = fourletter + 1 ;
               w = "";
           }
        }
        System.out.println("Number of two lettered words = " + twoletter);
        System.out.println("Number of four lettered words = " + fourletter);
    }
}
/**
  OUTPUT
  Enter a sentence
He that is down needs fear no fall
Number of two lettered words = 3
Number of four lettered words = 4
 */     