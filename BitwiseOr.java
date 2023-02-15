/*
 * Given an integer array arr, return the number of distinct bitwise ORs of all the non-empty subarrays of arr.

The bitwise OR of a subarray is the bitwise OR of each integer in the subarray. 
The bitwise OR of a subarray of one integer is that integer.

A subarray is a contiguous non-empty sequence of elements within an array.
input:- number of integers and list of integers
output:- Return the number of distinct bitwise ORs of all the non-empty subarrays.


Example 1:

Input: 1
0
Output: 1
Explanation: There is only one possible result: 0.
Example 2:
Input: 3
1 1 2
Output: 3
Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
These yield the results 1, 1, 2, 1, 3, 3.
There are 3 unique values, so the answer is 3.

Example 3:
Input:3
1 2 4
Output: 6
Explanation: The possible results are 1, 2, 3, 4, 6, and 7.

 */

import java.util.*;
public class BitwiseOr{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>hs=new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         ArrayList<Integer>s=new ArrayList<>();
    //         s.add(arr[i]);
    //         for(int j=i;j<n;j++){
    //             s.add(arr[j]);
    //             if(s.size()==1)hs.add(arr[j]);
    //             else{
    //                 int k=func(s);
    //                 hs.add(k);
    //             }
    //         }
    //     }
    //     System.out.println(hs.size());  
    // }
    // public static int func(ArrayList<Integer>res){
    //     int y=0;
    //     for(int i:res)y=y|i;
    //     return y; 
    // }
    for(int i=0;i<n;i++){
        hs.add(arr[i]);
        for(int j=i-1;j>=0;j--){
            if((arr[i]|arr[j])==arr[j])break;
            arr[j]|=arr[i];
            hs.add(arr[j]);
        }
    }
    System.out.println(hs.size()); 
}
}