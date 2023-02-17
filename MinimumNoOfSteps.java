import java.util.*;;
public class MinimumNoOfSteps {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MinNoOfSteps(n));
    }
    public static int MinNoOfSteps(int n)
    {
        int count = 0;
        while(n!=1)
        {
            if((n&1)==0)
            {
                n=n>>1;
            }
            else if(n==3||Integer.bitCount(n-1)<Integer.bitCount(n+1))
            {
                n--;
            }
            else
            {
                n++;
            }
            count++;
        }
        return count;
    }
}
