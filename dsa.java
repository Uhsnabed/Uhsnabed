class dsa
{
    public static void main()
    {
        char letters[] = {'e','e','e','k','q','q','q','v','v','y'};
        char target = 'q'; int c = 0;
        int l=0,m = 0 ;
       int u=letters.length;
        u=u-1;
        while(l<=u)
        {
            m = (l+u)/2;
            if(target==letters[m])
            {
                l++; 
                if(l==letters.length)
                {
                    l=0; break;
                }
                if(letters[c]!=letters[c+1] && letters[l]>target)
                    break;
                c++;
            }            
              if(target>=letters[letters.length-1])
            {
                l=0;  break;
            }
            if(target>letters[m])
                l = m +1;
            else if (target<letters[m])
                u = m - 1;
        }
        System.out.println(letters[l]);
    }
}