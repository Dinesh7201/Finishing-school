/*
 * Due to the heavy rains in TS & AP states, the road from 
Hyderabad to Kakinada destroyed at N places.
Let us assume Vijayawada is at the center bewteen Hyd and Kakinada
NHAI planned to call for fresh bids to repair these pool of destroyed roads.

The destroyed road is indicated as road[x]=[x-from, x-to], where 0 < = x < N 
-500 <= x-from < x-to <= 500. The road from Hyderabad to Vijayawada indicated 
with negative values, and Vijayawada to Kakinada indicated with positive values.

A destroyed road D2 = [r, s] follows a destroyed road D1 = [p, q] if q < r.
A pool of roads at different places can be formed in this way. 

NHAI given a task to you to find the size of maximum pool can be formed.
You do not need to use up all the given roads. You can select the roads in any order.

Note: Size is the number of destroyed roads in the pool.

Input Format:
-------------
Line-1: An integer N, number of roads.
Next N lines: two space separated integers, x-from and x-to values.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
4
1 4
-10 -3
-5 0
5 6

Sample Output-1:
----------------
3

Explanation:
------------
The pool is : [-10, -3] -> [1, 4] -> [5, 6]
or [-5, 0] -> [1, 4] -> [5, 6]


Sample Input-2:
---------------
4
-50 -20
-15 0
5 20
25 40

Sample Output-2:
----------------
4

Explanation:
------------
The pool is : [-50, -20] -> [-15, 0] -> [5, 20] -> [25, 40]



 */
import java.util.*;
public class desroad{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int s[]=new int[n];
        int m[][]=new int[n][2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                m[i][j]=sc.nextInt();
            }
            s[i]=m[i][0];
            hm.put(m[i][0],m[i][1]);
        }
        Arrays.sort(s);
        Stack<Integer>st=new Stack<>();
        st.push(hm.get(s[0]));
        for(int i=1;i<n;i++){
            if(st.peek()<=(s[i])){
                st.push(hm.get(s[i]));
            }
            else{
                st.pop();
                st.push(hm.get(s[i]));
            }
        }
        System.out.println(st.size());
}
}