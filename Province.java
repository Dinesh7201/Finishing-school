/*
 * There are N cities, and M routes[], each route is a path between two cities.
routes[i] = [city1, city2], there is a travel route between city1 and city2.
Each city is numbered from 0 to N-1.
 
There are one or more Regions formed among N cities. 
A Region is formed in such way that you can travel between any two cities 
in the region that are connected directly and indirectly.
 
Your task is to findout the number of regions formed between N cities. 
 
Input Format:
-------------
Line-1: Two space separated integers N and M, number of cities and routes
Next M lines: Two space separated integers city1, city2.
 
Output Format:
--------------
Print an integer, number of regions formed.
 
 
Sample Input-1:
---------------
5 4
0 1
0 2
1 2
3 4
 
Sample Output-1:
----------------
2
 
 
Sample Input-2:
---------------
5 6
0 1
0 2
2 3
1 2
1 4
2 4
 
Sample Output-2:
----------------
1
 
Note: Look HINT for explanation.

 */
import java.util.*;
class region{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int g[][]=new int[m][2];
        for(int i=0;i<m;i++){
           int a=sc.nextInt(),b=sc.nextInt();
           g[i]=new int[]{a,b};
        }
        int par[]=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
        }
        for(int i=0;i<g.length;i++){
            int x=g[i][0];
            int y=g[i][1];
            int t=par[x];
            if(par[x]!=par[y]){
                par[x]=par[y];
                for(int j=0;j<n;j++){
                    if(par[j]==t){
                        par[j]=par[y];
                    }
                }
            }
        }
        HashSet<Integer> hset = new HashSet<>();
       for(int i=0;i<par.length;i++){
           hset.add(par[i]);
       }
        System.out.println(hset.size());
    }
}