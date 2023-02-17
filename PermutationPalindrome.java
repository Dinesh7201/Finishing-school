/*
AlphaCipher is a string formed from another string by rearranging its letters

You are given a string S.
Your task is to check, can any one of the AlphaCipher is a palindrome or not.

Input Format:
-------------
A string S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
carrace

Sample Output-1:
----------------
true


Sample Input-2:
---------------
code

Sample Output-2:
----------------
false
*/
import java.util.*;
public class PermutationPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Palindrome(str));
    }
    public static boolean Palindrome(String str)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(!set.add(str.charAt(i)))
            {
                set.remove(str.charAt(i));
            }
        }
        if(set.size()<=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}