/*
 * /*
You are given some tokens printed with unique numbers on them and an integer T.
Your task is to find the least number of tokens that you need to make up the 
value T, by adding the numbers printed on all the tokens. 
If you cannot make the value T, by any combination of the tokens, return -1.

NOTE: Assume that you have an unlimited set of tokens of each number type.

Input Format:
-------------
Line-1: Space separated integers tokens[], number printed on tokens.
Line-2: An integer T.

Output Format:
--------------
Print an integer, minimum number of tokens to make the value T.


Sample Input-1:
---------------
1 2 5
11

Sample Output-1:
----------------
3

Explanation:
------------
5+5+1 = 11


Sample Input-2:
---------------
2 4
15

Sample Output-2:
----------------
-1

 */
import java.util.*;
class test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int arr[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int n=sc.nextInt();
        System.out.println(Count(arr,arr.length,n));
    }

    public static int Count(int nums[], int m, int n)
    {
    	int [][]dp= new int[m + 1][n + 1];
    
    	for(int i = 1; i <= n; i++){
    	    dp[0][i] = Integer.MAX_VALUE - 1;
    	}
    	for(int i = 1; i <= m; i++){
        	for(int j = 1; j <= n; j++){
        		if (nums[i - 1] > j){
        			dp[i][j] = dp[i - 1][j];
        		}
        		else{
        			dp[i][j] = Math.min(dp[i - 1][j],dp[i][j - nums[i - 1]] + 1);
        		}
        	}
    	}
    	return dp[m][n];
    }
}