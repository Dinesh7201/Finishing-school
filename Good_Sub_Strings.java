
/*A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Example 1:
input: s = "xyzzaz"
output: 1

Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".


Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".

*/
import java.util.*;
class Good_Sub_Strings
{
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
        int count=0;
        List<Character> l=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            l.add(s.charAt(i));
        }
      
           if(l.size()==Count(l))
            {
               count++;
            }
        // int list=0;
        for(int i=3;i<s.length();i++)
        {
            l.remove(l.get(0));
            l.add(s.charAt(i));
            if(l.size()==Count(l))
            {
               count++;
            }
        }
        System.out.println(count);
       sc.close();
    }
    
    
    public static int Count(List<Character> l){
        Set<Character> s=new HashSet<>();
        for(char i:l)
        {
            s.add(i);
        }
        return s.size();
    }
}