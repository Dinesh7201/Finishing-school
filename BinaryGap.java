/*
 * Given a positive integer n, find and return the longest distance 
between any two adjacent 1's in the binary representation of n.
 If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
The distance between two 1's is the absolute difference between their bit positions. 
 For example, the two 1's in "1001" have a distance of 3.
input format:
an integer number
output format:
an integer number

Example 1:
Input:  22
Output: 2

Explanation: 22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "10110" is not a valid pair since there is a 1 separating the two 1's.

Example 2:
Input:  8
Output: 0

Explanation: 8 in binary is "1000".
There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.

Example 3:
Input: 5
Output: 2
Explanation: 5 in binary is "101".

 */
import java.util.*;
public class BinaryGap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String bin=Integer.toBinaryString(n);
        char arr[]=bin.toCharArray();
        ArrayList<Integer>al=new ArrayList<>();
        int k=bin.indexOf('1');
        al.add(k);
        while(k>=0){
            k=bin.indexOf('1',k+1);
            al.add(k);
        }
        al.remove(al.size()-1);
        if(al.size()==0){
            System.out.println(0);
            System.exit(0);
        }
        int max=0;
        for(int i=0;i<al.size()-1;i++){
            int diff=Math.abs(al.get(i)-al.get(i+1));
            if(diff>=1){
                max=Math.max(max,diff);
            }
        }
        System.out.println(max);
    }
}
   