/*
 * /*The Valid shortcuts of a string "abcd", are as follows:
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
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        String t1=a[0];
        String t2=a[1];
        int r1=0,r2=0;
        while(r1<t1.length() && r2<t2.length()){
            if(Character.isDigit(t2.charAt(r2))){
                int tot=0;
                while(r2<t2.length() && Character.isDigit(t2.charAt(r2))){
                    tot=tot*10+t2.charAt(r2)-'0';
                    r2++;
                }
                r1=r1+tot;
            }
            else{
                if(t1.charAt(r1)==t2.charAt(r2)){
                    r1++;
                    r2++;
                }
                else{
                    break;
                }
            }
        }
        if(r1==t1.length() && r2==t2.length())System.out.println(true);
        else System.out.println(false);
    }
}