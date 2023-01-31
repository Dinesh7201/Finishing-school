/* Two brothers want to play a game, 
The rules of the game are: one player gives two sorted lists of 
numerical elements and a number (sum). 
The opponent has to find the closest pair of elements 
to the given sum.
-> pair consists of elements from each list

Please help those brothers to develop a program, that takes 
two sorted lists as input and return a pair as output.

Input Format:
-------------
size of list_1
list_1 values
size of list_2
list_2 values
closest number

Output Format:
--------------
comma-separated pair

Sample Input-1:
---------------
4
1 4 5 7
4
10 20 30 40
32
Sample Output-1
---------------
1,30

Sample Input-2
---------------
3
2 4 6
4
5 7 11 13
15

*/


import java.util.*;

class ClosestPair{
	public static void printClosest(int ar1[], int ar2[], int m, int n, int x)
	{
		int diff = Integer.MAX_VALUE;
		int res_l = 0, res_r = 0;
		int l = 0, r = n-1;
		while (l<m && r>=0)
		{
		if (Math.abs(ar1[l] + ar2[r] - x) < diff)
		{
			res_l = l;
			res_r = r;
			diff = Math.abs(ar1[l] + ar2[r] - x);
		}
		if (ar1[l] + ar2[r] > x)
			r--;
		else // move to the greater side
			l++;
		}

		System.out.print(ar1[res_l]+","+ar2[res_r]);
	}
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int len1 = sc.nextInt();
	    int[] arr1=new int[len1];
	    for(int i=0;i<len1;i++){
	        arr1[i]=sc.nextInt();
	    }
	    int len2=sc.nextInt();
	    int[] arr2= new int[len2];
	    for(int j=0;j<len2;j++){
	        arr2[j]=sc.nextInt();
	    }
	    int x = sc.nextInt();
		ClosestPair ob = new ClosestPair();
		ob.printClosest(arr1, arr2, len1, len2, x);
	}
}