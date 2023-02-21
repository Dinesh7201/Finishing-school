/*
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 

input =cbaebabacd
abc
output =0 6
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

input=abab
ab
output =0 1 2

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


 */


import java.util.*;
class Anagram{

public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str=sc.nextLine();
    System.out.println(findAnagrams(s,str));
}
public static  boolean isAnagram(int[] scnt,int[] pcnt){
        for(int i=0;i<26;i++)
        {
            if(scnt[i]!=pcnt[i]){
                return false;
            }
        }
        return true;
}
    public static List<Integer> findAnagrams(String s,String p)
    {
        List<Integer> lt=new ArrayList<>();
        int[] scnt=new int[26];
        int[] pcnt=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pcnt[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            scnt[s.charAt(i)-'a']++;
            if(i>=p.length()){
                scnt[s.charAt(i-p.length())-'a']--;
            }
            if(i>=(p.length()-1) && isAnagram(scnt,pcnt)){
                lt.add(i-(p.length()-1));
            }
        }
        return lt;
    }
}