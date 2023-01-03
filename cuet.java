import java.util.*;
class cuet
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type A to access shift 1 ,type B to access shift 2,Type C to access shift 3,Type D to access shift 4"); 
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'A':
            System.out.println("Enter number of students that appeared in the shift");
            int s1 = sc.nextInt();
            int raw_score1[] = new int[s1];
            String name1[] = new String[s1];
             for(int i=0;i<s1;i++)
            {
                System.out.println("Enter name and raw score of candidate " + (i+1));
                name1[i] = sc.nextLine();
                raw_score1[i] = sc.nextInt();
            }
            calculate(raw_score1, name1);
            break;
            case 'B':
            System.out.println("Enter number of students that appeared in the shift");
            int s2 = sc.nextInt();
            int raw_score2[] = new int[s2];
            String name2[] = new String[s2];
           for(int i=0;i<s2;i++)
            {
                System.out.println("Enter name of candidate " + (i+1));
                name2[i] = sc.nextLine();
                System.out.println("Enter raw score of candidate " + (i+1));
                raw_score2[i] = sc.nextInt();
            }
            calculate(raw_score2, name2);
            break;
            case 'C':
            System.out.println("Enter number of students that appeared in the shift");
            int s3 = sc.nextInt();
            int raw_score3[] = new int[s3];
            String name3[] = new String[s3];
           for(int i=0;i<s3;i++)
            {
                System.out.println("Enter name and raw score of candidate " + (i+1));
                name3[i] = sc.nextLine();
                raw_score3[i] = sc.nextInt();
            }
            calculate(raw_score3, name3);
            break;
            case 'D':
            System.out.println("Enter number of students that appeared in the shift");
            int s4 = sc.nextInt();
            int raw_score4[] = new int[s4];
            String name4[] = new String[s4];
           for(int i=0;i<s4;i++)
            {
                System.out.println("Enter name and raw score of candidate " + (i+1));
                name4[i] = sc.nextLine();
                raw_score4[i] = sc.nextInt();
            }
            calculate(raw_score4, name4);
            break;
            default:
            System.out.println("Please enter correct choice! Restart again ");
            System.exit(0);
           }
    }
    public static void calculate(int raw[], String name[])
    {
         int m=0; double percentile[] = new double[raw.length];
         for(int i = 0 ; i < raw.length; i++)
            {
                int score = raw[i];
                for(int j=i+1; j<raw.length;j++)
                {
                    if (raw[j]<=score)
                    {
                        m = m + 1 ;
                    }
                }
                percentile[i] = (m/raw.length) * 100;
            } 
          for(int i = 0 ; i < raw.length -1 ; i ++)
          {
              for(int j = i;j<raw.length - i - 1 ; j ++)
              {
                  if(percentile[j]<percentile[j+1])
                  {
                      double t = percentile[j] ;         String s = name[j];     int r = raw[j];
                      percentile[j] = percentile[j+1];   name[j] = name[j+1];    raw[j] = raw[j+1];
                      percentile[j+1] = t ;                name[j+1] = s;        raw[j+1] = r;
                  }
              }
          }
          System.out.println(" Name      " + " Raw score    "+ " Percentile ");
          for(int i = 0 ; i < raw.length ; i ++ )
          {
             System.out.println(name[i] + "     " + raw[i] + "     " + percentile[i] );
          }
    }
}