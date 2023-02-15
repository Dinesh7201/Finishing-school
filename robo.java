/*Chitti(ROBO) is busy in turning the people into chittis(ROBOS) by surrounding them.
In a room there are n*n boxes occupied by ROBOS and people.
   1.A person will be turned into ROBO if he is surrounded by all ROBOs. 
   2.A person will not be turned into ROBO if he is on the edge of the room
     and all the connected people to him (directly or indirectly) are also not to be turned.
 Return the n*n boxes after conversion.
 
Input Format
-------------
Line-1:integer n represent the n*n boxes of the room..
Next n lines:Each line of string consists of combination of 'X'(represents ROBO) and 'O'(represents a person)
   
Output Format:
--------------
Print n*n space seperated values after conversion.
  
   
Sample Input-1:
---------------
4
XXXX
XOOX
XXOX
OXXX
   
Sample Output-1:
----------------
X X X X 
X X X X 
X X X X 
O X X X 
   
Explanation:
------------
The people at second row and third row are converted to ROBOs as they are surrounded by ROBOs.
But the person at fourth row is safe as he is on edge.
  
   
Sample Input-2:
---------------
5
XOOOX
XXXXX
XOXXX
XXXOX
OXXXX
  
Sample Output-2:
----------------
X O O O X 
X X X X X 
X X X X X 
X X X X X 
O X X X X 
 */

import java.util.*;
public class robo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            for(int j=0;j<n;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        int vis[][]=new int[n][n];
        for(int i=0;i<n;i++){
            if(arr[0][i]=='O' && vis[0][i]==0){
                dfs(0,i,vis,arr);
            }
            if(arr[n-1][i]=='O' && vis[n-1][i]==0){
                dfs(n-1,i,vis,arr);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i][0]=='O' && vis[i][0]==0){
                dfs(i,0,vis,arr);
            }
            if(arr[i][n-1]=='O' && vis[i][n-1]==0){
                dfs(i,n-1,vis,arr);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='O' && vis[i][j]==0){
                   arr[i][j]='X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int row,int col,int vis[][],char arr[][]){
        if(row<0 || col<0 || row>arr.length-1 || col>arr[0].length-1 || vis[row][col]==1 || arr[row][col]=='X')return;
        vis[row][col]=1;
        dfs(row+1,col,vis,arr);
        dfs(row-1,col,vis,arr);
        dfs(row,col+1,vis,arr);
        dfs(row,col-1,vis,arr);
    }
}