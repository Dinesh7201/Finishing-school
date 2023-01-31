/*
 * Mr Suleman is given a checkerboard of size 400*400, where the indices starts 
from (-200,-200) and ends at (199,199). In one step, he can move the box from 
position (p,q) to one of the following positions in L shape like as follows: 
	- (p-2, q-1), (p-2, q+1), (p+2, q-1), (p+2, q+1)
	- (p-1, q+2), (p+1, q+2), (p-1, q-2), (p+1, q-2)

Initially the box is at (0,0) position, and need to move the box to position (m,n).
You will be given two integers m and n indicates the position(m,n).

Now your task is to help by Mr Suleman to find the minimum number of steps 
required to move the box from (0,0) to (m,n).

Note: It is allowed to move out of the board also.

Input Format:
-----------------
Two space separated integers, m and n, position.

Output Format:
------------------
Print an integer, minimum number of steps to reach (m,n).


Sample Input-1:
---------------
2 4

Sample Output-1:
----------------
2

Explanation:
-------------
Initially, you are at (0,0) position, you can reach (2,4) as follows:
(0,0) -> (1, 2) -> (2, 4) 


Sample Input-2:
---------------
4 7

Sample Output-2:
----------------
5

Explanation:
------------
Initially, you are at (0,0) position, you can reach (4,7) as follows:
(0,0) -> (1, 2) -> (2, 4) -> (1, 6) -> (3, 5) -> (4, 7)
 */
import java.util.*;
class test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,0});
        int dir[][]=new int[][]{{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{1,-2},{-1,2},{1,2}};
        int min=Integer.MAX_VALUE;
        int vis[][]=new int[402][402];
        boolean flag=true;
        // vis[req[0]+200][req[1]+200]=1;
        while(!q.isEmpty()){
            int r=q.size();
            for(int i=0;i<r;i++){
            int req[]=q.remove();
            vis[req[0]+200][req[1]+200]=1;
            for(int x[]:dir){
                int z1=req[0]+x[0];
                int z2=req[1]+x[1];
                if(z1==n1 && z2==n2){
                    min=Math.min(req[2]+1,min);
                    flag=false;
                }
                else{
                    if(z1>-200 && z1<=199+1 && z2>-200 && z2<=199+1 && vis[z1+200][z2+200]!=1 && flag){
                        vis[z1+200][z2+200]=1;
                        q.add(new int[]{z1,z2,req[2]+1});
                    }
                }
            }
            }
        }
        System.out.println(min);
    }
}