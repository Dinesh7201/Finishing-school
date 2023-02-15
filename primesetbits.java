/*
Given two integers left and right, return the count of numbers in the inclusive range [left, right]
 having a prime number of set bits in their binary representation.

Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101, which has 3 set bits.
 

Example 1:

Input: 6  10
Output: 4
Explanation:
6  -> 110 (2 set bits, 2 is prime)
7  -> 111 (3 set bits, 3 is prime)
8  -> 1000 (1 set bit, 1 is not prime)
9  -> 1001 (2 set bits, 2 is prime)
10 -> 1010 (2 set bits, 2 is prime)
4 numbers have a prime number of set bits.
Example 2:

Input: 10 15
Output: 5
Explanation:
10 -> 1010 (2 set bits, 2 is prime)
11 -> 1011 (3 set bits, 3 is prime)
12 -> 1100 (2 set bits, 2 is prime)
13 -> 1101 (3 set bits, 3 is prime)
14 -> 1110 (3 set bits, 3 is prime)
15 -> 1111 (4 set bits, 4 is not prime)
5 numbers have a prime number of set bits.

*/

import java.util.*;
class Test {
    public int countPrimeSetBits(int l, int r) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19 /*, 23, 29 */ ));
        int cnt = 0;
        for (int i = l; i <= r; i++) {
            int bits = 0;
            for (int n = i; n > 0; n >>= 1)
                bits += n & 1;
            cnt += primes.contains(bits) ? 1 : 0;
        }
        return cnt;        
    }
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   System.out.println(new Test().countPrimeSetBits(num1,num2));
}

}
/*Test cases
Case 1:
Input: 5 25
Output: 17
case 2:
Input : 10 20
output=9
case 3:
input: 2 100
output=65
case 4:
input : 5 65
output :41 
case 5:
input :15 35
ouput :14 
case 6:
input :1 30
output:20 */