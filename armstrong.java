 
import java.util.*;
public class armstrong {
    long a,b;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        a = sc.nextLong();
        System.out.println("Enter upper limit");
        b = sc.nextLong();
    }
    void find_armstrong()
    {   long sum=0;
        for(long i = a ; i <= b ; i ++)
        {   sum = 0;
            long z = i;
            while(z>0)
            {
                long r = z%10;
                sum = sum + r*r*r;
                z = z / 10;
            }
            if(sum==i)
                System.out.print(i+" ");
        }
    }

    public static void main() {
        armstrong ob = new armstrong();
        ob.input();
        ob.find_armstrong();
    }
}
