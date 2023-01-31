/* Given a string s, .reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Example 1:
Input: hello
Output: holle


Example 2:
Input: Keshavmemorial
Output: Kashivmomerael

Example 3:
Input: variations
Output: voriatians

*/

import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Solution solution = new Solution();
        String output = solution.reverseVol(str);
        System.out.println(output);
    }
    public String reverseVol(String str){
        char[] chars = str.toCharArray(); 
        String vowels = "AEIOUaeiou";
        if(str.length()==0 || str == null){
            return "";
        }
        int start=0;
        int end=str.length()-1;
        while(start<end){
            while(start<end && !vowels.contains(chars[start]+ "")){
                start++;
            }
            while(start<end && !vowels.contains(chars[end]+ "")){
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
