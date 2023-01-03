class c
{
    public static void main()
    {
        int arr[] = {5,7,7,7,7,8,8,10};
        int target = 6;
        int l=0,u=arr.length-1,m=0, f=0;
        int b[] = new int[2];
        while(l<=u)
        {
            m= (l+u)/2;
            if(target==arr[m])
            {  f++;
                for(int i = 0;i<=m;i++)
                {
                    if(arr[i]==target)
                    {b[0] = i; break;}
                }
                break;
            }
            if(target>arr[m])
            l = m + 1;
            else if(target<arr[m])
            u = m-1 ;
        }
        l=0;u=arr.length-1;m=0;f=0;
        while(l<=u)
        {
            m= (l+u)/2;
            if(target==arr[m])
            { f++;
                for(int i = arr.length-1;i>=m;i--)
                {
                    if(arr[i]==target)
                    {b[1] = i; break;}
                }
                break;
            }
            if(target>arr[m])
            l = m + 1;
            else if(target<arr[m])
            u = m-1 ;
        }
        if(f==0)
       { b[0] = -1 ; b[1] = -1;}
        System.out.println(b[0] + " " + b[1] );
    }
}