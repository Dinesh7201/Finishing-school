/*
 * /*
There are numerous possible combinations of HTML colour codes, and each one is 
given a specific identification number. Each codes[i] in the list,  
is an HTML colour code that was chosen by the web designer. The list may 
contain duplicate codes.

The web designer's customer made the decision to eliminate P number of 
consecutive codes from the list. However, the web designer wants to preserve as 
many distinctive colour codes as he can. Find out how many unique colour codes 
the web designer can preserve, and print the count of unique color codes.


Input Format:
-------------
Line-1: Comma separated integers, codes[], HTML color codes
Line-2: An integer P.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
2,3,2,6,3,3,7,1
4

Sample Output-1:
----------------
4

Explanation: 
------------
The unique color codes he can preserve are, [2,3,7,1]
by removing [2,6,3,3].


Sample Input-2:
---------------
1,2,1,2,3,3,2,1,2,1
6

Sample Output-2:
----------------
2

Explanation: 
------------
The unique color codes he can preserve are, [2,1,2,1] or [1,2,1,2]
by removing 6 contiguous codes.
*/
import java.util.*;
class color{
    static int max=0;
    public static int color(String s[],int n,int p,int q){
        Set<Integer>se=new HashSet<>();
        if(p==(s.length-n)+1 || q==(s.length)){
            return max;
        }
        if(p==0){
            for(int i=n;i<s.length;i++){
                se.add(Integer.parseInt(s[i]));
            }
        }
        else if(q==(s.length-1)){
            for(int i=0;i<p;i++){
                se.add(Integer.parseInt(s[i]));
            }
        }
        else{
        for(int i=0;i<p;i++){
            se.add(Integer.parseInt(s[i]));
        }
        for(int i=q+1;i<s.length;i++){
            se.add(Integer.parseInt(s[i]));
        }
        }
        int rec=color(s,n,p+1,q+1);
        max=Math.max(se.size(),rec);
        return max;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(",");
        int n=sc.nextInt();
        System.out.println(color(s,n,0,n-1));
    }
}