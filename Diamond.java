/*
 * /*
Sharath is playing a game where there are N levels. Initially at Level-1. 
In order to win the game he has to reach the Nth level.

According to the game rules, in one step :
    - He can complete one level at a time (OR)
    - He can jump from the current level 'L' to 'L*2' level, by losing 1 diamond.  

The game has N levels and Sharath is given D diamonds.
Find the least number of steps required to finish the game by Sharath.
And print the number of steps.

Input Format:
-------------
Two space separated integers, N and D

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
7 1

Sample Output-1:
----------------
4

Explanation: 
------------
Sharath is at level-1, 
Step-1: He can complete level-1 and move to level-2
Step-2: He can complete level-2 and move to level-3
Step-3: He can use the diamond and jump to level-(3*2) => level-6
Step-4: He can complete level-6 and move to level-7, He wins the game.


Sample Input-2:
---------------
23 3

Sample Output-2:
----------------
7

*/
import java.util.*;
class dia{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr[0],d=arr[1],res=0;
        while(n!=1){
            if(n%2==0 && d>0){
                n=n/2;
                res++;
                d--;
            }
            else{
                n=n-1;
                res++;
            }
        }
        System.out.println(res);
    }
}