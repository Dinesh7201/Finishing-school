/*
 * /*
Mr. Parandamayya is working with Strings.
He is given a String S. He has to find the palindromes in S, 
A palindrome can be a substring of S (Strictly substrings only, not subsequences).

Your task is to find the count the number of palindromes can be formed from S.

NOTE: Count each occurence of palindromes if duplicate substrings found. 

Input Format:
-------------
A string S

Output Format:
--------------
Print an integer, number of palindromes.


Sample Input-1:
---------------
divider

Sample Output-1:
----------------
9

Explanation:
-------------
Palindromes are d, i, v, i, d, e, r, ivi, divid

Sample Input-2:
---------------
abcdef

Sample Output-2:
----------------
6

Explanation:
-------------
Palindromes are a, b, c, d, e, f.
*/
import java.util.*;
public class palin{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    String c=s.substring(i,j+1);
                    if(palindrome(c)){
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
    }
    public static boolean palindrome(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        if(s.equals(r)){
            return true;
        }
        return false;
    }
}