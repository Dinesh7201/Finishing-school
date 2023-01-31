/*
 * /*
A professional thief entered into a floor in a building,
The floor has M*N inter connected rooms, the thief can enter into any room 
from any other room. And there are few rooms closed from inside, so the thief 
cannot enter into them. Initially the thief is at room[0][0] and has to exit 
from room[m-1][n-1].

You will be given the array room[][], filled with either 0 or 1.
Here, 1-indiactes a closed room, 0-indiactes a open room.
Your task is to find and print the number of unique escape routes 
from room[0][0] and room[m-1][n-1]. And the thief can move only in 
two directions one is forward direction and other is downward direction.


Input Format:
-------------
Line-1: Two space separated integers, M and N.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer result.

Sample Input-1:
---------------
3 4
0 0 0 0
0 1 0 0
0 0 1 0

Sample Output-1:
----------------
2


Sample Input-2:
---------------
4 4
0 0 0 0
0 0 1 0
1 0 0 0
0 0 1 0

Sample Output-2:
----------------
3
*/
import java.util.*;
class unique{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int grid[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }int dp[][]=new int[n][m];
        for(int i[]:dp)Arrays.fill(i,-1);
        System.out.println(un(n-1,m-1,grid,dp));
    }
    public static int un(int i,int j,int grid[][],int dp[][])
    {
        if(i<0 || j<0)return 0;
        if(i==0 && j==0 && grid[i][j]!=1)return 1;
        if(grid[i][j]!=0)return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=un(i-1,j,grid,dp);
        int left=un(i,j-1,grid,dp);
        return dp[i][j]=up+left;
    }
}