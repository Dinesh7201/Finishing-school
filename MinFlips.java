/*Given 3 positives numbers a, b and c. 
Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

Example 1:
Input: a = 2, b = 6, c = 5
Output: 3
Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)

Example 2:
Input: a = 4, b = 2, c = 7
Output: 1

Example 3:
Input: a = 1, b = 2, c = 3
Output: 0
 
Constraints:

1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9
*/
import java.util.*;
class main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(minFlips(a,b,c));
    }
    public static int minFlips(int a, int b, int c) {
    int flipCount = 0;
    for (int i = 0; i < 32; i++) {
        int bitA = (a >> i) & 1;
        int bitB = (b >> i) & 1;
        int bitC = (c >> i) & 1;
        if (bitC == 0) {
            if (bitA == 1) flipCount++;
            if (bitB == 1) flipCount++;
        } else {
            if (bitA == 0 && bitB == 0) flipCount++;
        }
    }
    return flipCount;
}

}