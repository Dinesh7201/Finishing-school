/*Mr.Sathya is playing with numbers he converts the decimal to binary and try to find number of positions at which the corresponding
bits are different. Help sathya by giving solution to the problem to find sum of bits differences between all the pairs of the 
integers in given numbers.
Input
Number of integers and List of integers
output
Return the sum of bit differences between all the pairs of the integers.
 
Example 1:

Input:
3
4 14 2
Output: 6
Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case).
The answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.

Example 2:
Input: 
3
4 14 4
Output: 4*/
import java.util.*;
class Solution{
public int totalHammingDistance(int[] nums) {
    int total = 0, n = nums.length;
    for (int j=0;j<32;j++) {
        int bitCount = 0;
        for (int i=0;i<n;i++) 
            bitCount += (nums[i] >> j) & 1;
        total += bitCount*(n - bitCount);
    }
    return total;
   }
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in); 
	 int n=sc.nextInt();
	 int ar[]=new int[n];
	 for(int i=0;i<n;i++)
		 ar[i]=sc.nextInt();
	 System.out.println(new Solution().totalHammingDistance(ar));
	
	}
}
/*Test cases
case 1:
input=
4
1 2 3 4
output=11
case 2:
input=
5
10 20 30 40 50
output=30
case 3:
input=
5
10 12 13 14 15
output=16
case 4:
input=8
10 20 30 40 50 60 70 80
output=90
case 5:
input=15
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
output=224
case 6:
input=20
12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
output=456
*/