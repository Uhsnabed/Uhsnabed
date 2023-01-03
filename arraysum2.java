import java.util.*;
class arraysum2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("enter array elements:");
        for(int i = 0 ; i < l ; i ++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum to be checked ");
        int sum = sc.nextInt();
        System.out.println("Two numbers which adds up to give the sum are:");
        for(int i= 0 ; i < l-1 ; i++)
        {
            for(int j = i + 1;j<l; j++)
            {
                if(arr[i] + arr[j] == sum)
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}