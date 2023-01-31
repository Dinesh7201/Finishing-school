/*
 * Mr Subodh is given an array arr[] of M integers between 0 to 10000.
And he is also given another integer P.
Subodh has to update each integer in the arr[]:
Subodh is allowed to update the arr[i], as follows:
	- arr[i] = arr[i] + P (or) arr[i] = arr[i] - P.

Subodh has to find the update score as the difference between 
maximum element in the arr[] to the minimum element arr[] after all the
elements in the arr[] updated. and return the minimum update score.

Input Format:
-------------
Line-1: Two space separated integers M and P.
Line-2: M space separated integers, integer > 0.

Output Format:
--------------
Print an integer result.

Sample Input-1:
---------------
3 2
2 6 3

Sample Output-1:
----------------
1

Explanation: 
------------
Update the array as [4, 4, 5]. The score is maximum(arr) - minimum(arr)
=> 5 - 4 = 1.


Sample Input-2:
---------------
4 3
1 11 8 4

Sample Output-2:
----------------
4

Explanation: 
------------
Update the array as [4, 8, 5, 7]. The score is maximum(arr) - minimum(arr) 
=> 8 - 4 = 4

 */
import java. util.*;
public class small{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
        }
        int len=arr[0];
        int k=arr[1];
        int m[]=new int[len];
        for(int i=0;i<len;i++){
            m[i]=sc.nextInt();
        }
        Arrays.sort(m);
        int res=Integer.MAX_VALUE;
        int l=m[len-1]-m[0];
        for(int i=1;i<len;i++){
            int min1=m[0]+k;
            int min2=m[i]-k;
            int max1=m[i-1]+k;
            int max2=m[len-1]-k;
            int min=Math.min(min1,min2);
            int max=Math.max(max1,max2);
            res=Math.min(res,max-min);
        }
        System.out.println(Math.min(l,res));
    }
}