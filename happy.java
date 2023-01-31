/*
 * Ravi is playing with strings. Given Three alphabets [a,b,c], Ravi has to 
make strings such that no two adjacents alphabets are the same.

For example, He can make strings as "ab", "acb", "b" and "cbabcabcb" which 
are acceptable. whereas the strings "bb", "bcc" and "aabbc" are not acceptable.

Given two integers N and L, Ravi made a list of all acceptable strings of 
length N sorted in lexicographical order.

Return the Lth string of this list or return an empty string if there are less 
than L acceptable strings of length N.

Input Format:
-------------
Line-1: Two space separated integers N and L.

Output Format:
--------------
Print a string result.


Sample Input-1:
---------------
2 3

Sample Output-1:
----------------
ba

Explanation:
-------------
Strings in lexigraphical order are ab,ac,ba,bc,ca,cb. and 3rd one is ba.


Sample Input-2:
---------------
3 4

Sample Output-2:
----------------
acb

Explanation:
------------
Strings in lexigraphical order are aba,abc,aca,acb,bab....

 */
import java.util.*;
class Solution {
    
    public static List<String> func(int n, int i, int prev, HashMap<Integer, List<String>> map) {
        if(i == n) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        if(map.containsKey(i * 10 + prev)) return map.get(i * 10 + prev);
        List<String> curr = new ArrayList<>();
        for(int l = 0; l < 3; l++) {
            if(prev != l) {
                char ch = (char)(l + 97);
                List<String> small = func(n, i + 1, l, map);
                for(int j = 0; j < small.size(); j++) curr.add(ch + small.get(j));
            }
        }
        map.put(i * 10 + prev, curr);
        return curr;
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
    
        String str =getHappyString(n,k);
        System.out.print(str);
        }
    public static String getHappyString(int n, int k) {
        List<String> ans = func(n, 0, 3, new HashMap<>());
        if(ans.size() < k) return "";
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++) pq.add(ans.get(i));
        for(int i = k; i < n; i++) {
            if(ans.get(i).compareTo(pq.peek()) < 0) {
                pq.poll();
                pq.add(ans.get(i));
            }
        }
        return pq.peek();
    }
}