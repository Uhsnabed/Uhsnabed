// WAP TO ADD MISSING ELEMENTS IN AN ARRAY ( IF ANY ) AT ANY POSITION.
import java.util.*;
class ele
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array ");
        for(int i = 0 ; i<size;i++)  // printing the original array
        {
           System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("If you want to add more array elements enter 1 and if you want to terminate the program enter 0");
        int choice = sc.nextInt();
        if(choice==0)
        System.exit(0);
        System.out.println("Enter position after which you want to add array element/s");
        int pos = sc.nextInt();
        int indx = pos - 1 ;   // since index starts from 0 and index = position - 1
        System.out.println("Enter number of elements you want to add ");
        int n = sc.nextInt();
        size = size + n;   // increasing the storage of the array with adding the previous size and number of elements to be added more in the array
        int arr1[] = new int[size];  // array to store the modified array
        int arr2[] = new int[n];   // array to store the elements to be added in the array
        System.out.println("Enter the elements you want to add ");
        for(int i =0 ; i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0 ;i<size;i++)   // storing elements in the modified array
        {
            if(i<=indx)   
            arr1[i] = arr[i];
            else if(i>(indx + n))
            arr1[i] = arr[i-n];
            else
            {
                arr1[i] = arr2[c];   // filling up the vacant spaces of array arr1 with elements of arr2 to be added in the array arr1
                c = c + 1 ;
            }
        }
        System.out.println("Modified array ");
        for(int i = 0 ; i<size;i++)    // displaying the array after addition of desired number of elements in desired position of the array
        {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
    }
}
/**
 OUTPUT 1
 Enter size of the array 
5
Enter array elements
10
20
50
60
70
Original array 
10  20  50  60  70  
If you want to add more array elements enter 1 and if you want to terminate the program enter 0
0
 OUTPUT 2
 Enter size of the array 
5
Enter array elements
10
20
50
60
70
Original array 
10  20  50  60  70  
If you want to add more array elements enter 1 and if you want to terminate the program enter 0
1
Enter position after which you want to add array element/s
2
Enter number of elements you want to add 
2
Enter the elements you want to add 
30
40
Modified array 
10  20  30  40  50  60  70  
 OUTPUT 3
 Enter size of the array 
6
Enter array elements
10
20
30
90
100
110
Original array 
10  20  30  90  100  110  
If you want to add more array elements enter 1 and if you want to terminate the program enter 0
1
Enter position after which you want to add array element/s
3
Enter number of elements you want to add 
5
Enter the elements you want to add 
40
50
60
70
80
Modified array 
10  20  30  40  50  60  70  80  90  100  110 
 OUTPUT 4
 Enter size of the array 
4
Enter array elements
10
20
30
40
Original array 
10  20  30  40  
If you want to add more array elements enter 1 and if you want to terminate the program enter 0
1
Enter position after which you want to add array element/s
4
Enter number of elements you want to add 
3
Enter the elements you want to add 
50
60
70
Modified array 
10  20  30  40  50  60  70 
*/