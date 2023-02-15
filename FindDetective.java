/*
 * There is a party happening in Novotel. There are N guests in the party.
There is a detective in the party and he/she is among one of the guests.
The guests are identified with unique ID's starts from 1 to N.

The rules to identify the detective are:
	- Every guest in the party knows the detective.
	- The detective knows no one in the party.
	- There is only one guest who satisfy both rule-1 and rule-2

You are given two integers N and R and the relations as an array, relations[], where relation[i]={guest-i, guest-j}, indicates guest-i knows h=guest-j.
Your task is to find the detective among the guests in the party and print the ID of the detective, Otherwise print -1.

Input Format:
-------------
Line-1: Two integers N and R, the number of guests and relations in the party.
Next R lines: contains 2 space-separated integers, relation[i]

Output Format:
--------------
Print an integer, the id of the detective.


Sample Input-1:
---------------
3 2		// N and R values
1 3
2 3

Sample Output-1:
----------------
3


Sample Input-2:
---------------
3 3
1 2
2 3
3 1

Sample Output-2:
----------------
-1

 */
import java.util.*;
public class FindDetective{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        int n=arr[0],r=arr[1];
        ArrayList<int[]>res=new ArrayList<>();
        for(int i=0;i<r;i++){
            int q[]=new int[2];
            q[0]=sc.nextInt();
            q[1]=sc.nextInt();
            res.add(q);
        }
       int fin[]=new int[n+1];
       for(int i[]:res){
           fin[i[0]]--;
           fin[i[1]]++;
       }
       int cnt=-1;
       for(int i=0;i<fin.length;i++){
           if(fin[i]==n-1){
               cnt=i;
           }
       }
       System.out.println(cnt);
    }
}