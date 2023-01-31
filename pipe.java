/*
 * Naveen manages the pipe warehouse. There is n number of pipes placed vertically 
along a wall. Given l[i] is the length of the ith pipe placed on the wall from 
left to right(0-indexed). Naveen's task is to check if the pipes are in 
non-decreasing order of lengths on the wall from left to right.
If not, he can choose only 1 pipe on the wall and replace it with another pipe 
from the warehouse to make it non-decreasing order.

There are all integer type lengths provided by the warehouse.
Help Naveen whether he can make the pipes in non-decreasing order.

Input Format:
-------------
Line-1: An integer n, number of pipes on the wall.
Line-2: n space separated integers represents length of each pipe.


Output Format:
--------------
return boolean value

Sample Input-1:
---------------
5
3 4 7 6 8

Sample Output-1:
----------------
true

Explanation:
------------
Replace 7 with 5 will become non decreasing array.

Sample Input-2:
---------------
4
2 5 4 1

Sample Output-2:
----------------
false

Explanation:
------------
Inorder to make it non-decreasing array we have to replace 2 elements which is not allowed.

 */
import java.util.*;
public class pipe{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                c=c+1;
                
            }  if(c>1){
                break;
            }      
            
        }
        if(c>1){
            System.out.println(false);
            System.exit(0);
        }
        System.out.println(true);
    }
}