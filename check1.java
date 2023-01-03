/**
  WAP TO TAKE INPUT A SENTENCE FROM THE USER AND COUNT TOTAL NUMBER OF WORDS STARTING WITH CAPITAL VOWELS AND PRINT THE ORIGINAL
  SENTENCE AND NUMBER OF WORDS STARTING WITH CAPITAL VOWEL.
 */
import java.util.*;
class check1
{
    String Str;
    int w=0; String w1= ""; 
    void InputString()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        Str = sc.nextLine(); Str = Str.trim() ; Str= Str + " ";
    }

    void counter(int i)
    {  String vowel = "AEIOUaeiou";
        if(i<Str.length())
        {
            char ch1 = Str.charAt(i);

            if(ch1!=' ')
                w1 = w1 + ch1; 
            else
            { 
                char ch2 = w1.charAt(0);
                int a = ch2;
                if(a>=65 && a<=90 && vowel.indexOf(ch2)!=-1)   //# checking if the word is a capital vowel or not
                    w = w + 1;
                w1 = "";
            }
            counter(i+1);  //# recursive function by passing i
        }
    }

    void Disp()
    {
        System.out.println("The sentence: "+ Str);
        System.out.println("Number of words starting with capital vowels "+w);
    }

    public static void main()
    {
        check1 ob = new check1();
        ob.InputString();
        ob.counter(0);  //# passing i = 0
        ob.Disp();
    }
}
/**
OUTPUT
 Enter a string
The Sun rises In the East
The sentence: The Sun rises In the East 
Number of words starting with capital vowels 2
*/