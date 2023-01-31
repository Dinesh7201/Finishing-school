/*The Valid shortcuts of a string "abcd", are as follows:
abcd, abcd, a1cd, ab1d, abc1, 2cd, a2d, ab2, 1b1d, 1bc1,a1c1, 
1b2, 2c1, 3d, a3, 4

You are given a string S and shortcut string  SC, 
Your task is to find out whether the string matches with the 
given shortcut or not.
if matched print true, else false.

Note:
String S contains only lowercase letters and String SC contains 
only lowercase letters and digits.

Input Format:
-------------
Two space separated Strings S and SC

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
internationalization i12iz4n

Sample Output-1:
----------------
true

Sample Input-2:
---------------
apple a2e

Sample Output-2:
----------------
false
*/



import java.util.*;
class Solution{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        String str=s[0];
        String k=s[1];
        int count=0,i=0,j=0;
        while(i<str.length() && j<k.length()){
            if(k.charAt(j)>='0' && k.charAt(j)<='9'){
                count=count*10+(k.charAt(j)-'0');
            }
            else{
                if(count!=0){
                    i=i+count;
                    count=0;
                }
                if(i>=str.length() || k.charAt(j)!=str.charAt(i)){
                    System.out.println("false");
                    System.exit(0);
                }
                i++;
            }
           
            j++;
        }
        if(j==k.length() && i==str.length()){
            System.out.println("true");
        }
        else{
        System.out.println("false");
        }
    }
}