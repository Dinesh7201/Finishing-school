/* You are given a string s. We want to partition the string into 
as many parts as possible so that each letter appears in at most 
one part.

Note that the partition is done so that after concatenating 
all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.

 

Example 1:
Input: ababcbacadefegdehijhklij
Output: [9, 7, 8]

Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.

Example 2:
Input: eccbbbbdec
Output: [10]

Example 3:
Input: abacadcklmklmxyyzx
Output: [7, 6, 5]

*/

import java.util.*;
class Solution{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        List<Integer>l=new ArrayList<>();
        int k=0;
        while(k<s.length()){
            int max=mp.get(s.charAt(k)),n=k+1;
            while(n<max){
                int curr=mp.get(s.charAt(n));
                if(curr>max){
                    max=curr;
                    
                }
                n++;
            }
            l.add(max-k+1);
            k=max+1;
        }
    System.out.println(l);
    }
}