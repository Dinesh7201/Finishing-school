/*
 * /* Two brothers want to play a game, 
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
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int a2[]=new int[m];
        for(int i=0;i<m;i++){
            a2[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0,r=m-1;
        int min=Integer.MAX_VALUE;
        //int max=Integer.MIN_VALUE;
        int res[]=new int[2];
        while(l<n && r>=0)
        {
            int y=a2[r]+a1[l];
            int val=Math.abs(k-y);
           // System.out.println(val+" "+y+" "+l+" "+r);
            if(val<min){
                //min=val;
                res[0]=a1[l];
                res[1]=a2[r];
                min=val;
            }
            if(y>k){
               // min=val;
                r--;
            }
            else{
                l++;
            }
            
        }
        for(int i:res)System.out.print(i+" ");
    }
}