/*
 * /*
There are a series of boxes and each box is labelled with a number.
Your task is to find the subsets of boxes such that addition of all 
the numbers written on each box makes an odd number.

Return only the number of such subsets exist.
Since the answer can be very large, return it modulo 10^9 + 7.

Input Format:
-------------
Line-1: an integer n represents the number of boxes
Line-2: n space seperated integers represents the numbers on the boxes.

Output Format:
--------------
return an integer represents number of subsets.

Sample Input-1:
---------------
3
1 5 7

Sample Output-1:
----------------
4

Explanation:
------------
subsets with odd sum are [1],[5],[7],[1,5,7].

Sample Input-2:
---------------
4
2 3 4 5

Sample Output-2:
----------------
6

Explanation:
-------------
subsets with odd sum are [3],[5],[2,3],[3,4],[4,5],[2,3,4].

 */




import java.util.*;
class OddSum
{
    public static List<Integer> l=new ArrayList<>();
    public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            helper(arr,i);
            
        }
        System.out.println(l.size());
    }
    public static void helper(int arr[],int k)
    {
        
        int s=0;
        for(int i=0;i<k;i++)
        {
            s=s+arr[i];
        }
        if(s%2!=0)
            l.add(s);

        for(int i=k;i<arr.length;i++)
        {
            s=s-arr[i-k];
            s=s+arr[i];
            if(s%2!=0)
                l.add(s);
                //System.out.println(s);
                
        }
        
       
        
    }
    
}