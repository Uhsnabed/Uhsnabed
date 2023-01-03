import java.util.*;
class ascii_string
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine(); String w =""; 
        s = s.trim() ; s = s + " ";  int l =s.length();
        int arr1[] = new int [100]; int arr2[] = new int[100]; int c1 = 0; int c2 = 0; int a = 0;
        for(int i = 0 ; i<l; i++)
        {
            char ch = s.charAt(i);
            a = ch;
            if(a>=97 && a<=122)
            {

                arr1[c1] = a;
                c1 = c1 + 1;
            }
            else if(a>=65 && a<=90)
            {

                arr2[c2] = a;
                c2 = c2 + 1;
            }
        }

        int min = arr1[0]; 
        for(int i = 0; i<c1 ; i++)
        {
            if(arr1[i]<min)
                min = arr1[i];
        }
        int max = arr2[0];
        for(int i = 0; i<c2 ; i++)
        {
            if(arr2[i]>max)
                max = arr2[i];
        }
        char z1 = (char)min;
        char z2 =(char)max;
        System.out.println(" Character with lowest ascii code in lower case : " + z1);
        System.out.println(" Character with highest ascii code in upper case : " + z2);

    }
}
/**
OUTPUT
Enter a sentence
Purity of Mind is Essential
Character with lowest ascii code in lower case : a
Character with highest ascii code in upper case : P
 */