/**
  THE ALPHABETS ARE ENCRYPTED AS A = 1 , B = 2 , C = 3 .... Z = 26. THE STRENGTH OF THE WORD IS FOUND BY ADDING THE ENCRYPTED VALUES OF EACH ALPHABET.
  FOR EXAMPLE: - THE STRENGTH OF BOY = 2 + 15 + 25 = 42
  WAP TO ACCEPT A SENTENCE IN UPPER CASE AND TERMINATED BY "." , "?" OR "!". EACH WORD OF THE SENTENCE IS SEPERATED BY A SINGLE BLANK SPACE. DECODE
  THE WORD ACCORDING TO THEIR STRENGTH AND ARRANGE THEM IN ASCENDING ORDER.
 */
import java.util.*;
class colour
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence in upper case terminated by either (.) or (?) or (!) and seperated by a single blank space");
        String s = sc.nextLine(); char ch3 = s.charAt(s.length()-1);  //# storing the last character(punctuation)
        s = s.toUpperCase(); s = s.substring(0,s.length()-1);
        s=s.trim(); s= s +" "; String w = "";
        int st = 0; int l = s.length(); int k=0; int k1 = 0; 
        int a[] = new int[100]; String b[] = new String[100]; //# arrays to store each word and their respective strength 
        int c = 0;
        for(int i = 0;i<l ; i++)
        {
            char ch1 = s.charAt(i);
            if(ch1!=' ')
            {
                w = w + ch1;
            }
            else
            {
                int l1 = w.length();
                for(int j = 0;j<l1;j++)
                {
                    char ch2 = w.charAt(j);
                     k = ch2;
                     k1 = k - 64;
                    st = st + k1;   //# storing strength in st
                }
                a[c] = st; b[c] = w; c++;
                System.out.println(w + " = " + st);  //# printing each word along with their strength
                st = 0; k1 = 0; w = "";
            }
        }
        for(int i = 0;i<c-1;i++)   //# bubble sorting to sort the words according to their potential 
        {
            for(int j = 0 ; j<c-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t = a[j]; String t1 = b[j];
                    a[j] = a[j+1]; b[j] = b[j+1];
                    a[j+1] = t;   b[j+1] = t1;
                }
            }
        }
        /*for(int i = 0 ;i <c;i++)  //# printing the sorted array of strength of each word
        {
            System.out.println(a[i]);
        }*/
         for(int i = 0 ;i <c;i++)  //# printing the sorted array of words according to their strength
        {
            if(i==(c-1))
             System.out.print(b[i]);
            else
            System.out.print(b[i] + " ");
        }
        System.out.println(ch3);  //# adding the punctuation of the original sentence
     }
}
/**
 OUTPUT 1
 Enter a sentence in upper case terminated by either (.) or (?) or (!) and seperated by a single blank space
HOW ARE YOU?
HOW = 46
ARE = 24
YOU = 61
ARE HOW YOU?
OUTPUT 2
 Enter a sentence in upper case terminated by either (.) or (?) or (!) and seperated by a single blank space
THE BLUE COLOUR.
THE = 33
BLUE = 40
COLOUR = 84
THE BLUE COLOUR.
*/