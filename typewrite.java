/*
 * Aruna is a typewriter, typing a document on her laptop. Suddenly her system got
hacked and whatever she types as words are displayed in reverse and with simple 
braces. She types only lowercase letters.

In order to get the actual words, Aruna has to reverse each word starting with 
the word which is in innermost most braces and remove those braces.
Help Aruna to get actual words.

Constraints:
------------
  - 0 <= word.length <= 2000
  - Word only contains lower case English characters and parentheses.
    It's guaranteed that all braces are balanced.


Input Format:
-------------
Line-1: a string represents an encoded word.

Output Format:
--------------
return the original string.


Sample Input-1:
---------------
(pqrs)

Sample Output-1:
----------------
srqp


Sample Input-2:
---------------
(uoy(are)woh)

Sample Output-2:
----------------
howareyou

Explanation
------------
Initially "are" will be revesed as "era".
Then (uoyerawoh) will be reversed.

 */
/*import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str= reverseParentheses(s);
        System.out.print(str);
    }
    public static String reverseParentheses(String s) {
        return reverseParentheses1(s,0,s.length()-1).toString();
    }
    
    public static StringBuilder reverseParentheses1(String s, int left, int right) {
        int level = 0;
        StringBuilder sb = new StringBuilder();
        int start = -1, end = -1;
        for(int i = left; i <= right ; i ++){
            if(level == 0 && Character.isLetter(s.charAt(i)) )  sb.append(s.charAt(i));

            if(s.charAt(i) == '(' ) {
                if(level == 0) start  = i+1;
                level++;
            }
            if(s.charAt(i) == ')' ){
                level--;
                if(level == 0){
                    sb.append(reverseParentheses1(s,start, i-1).reverse());
                }
            }
            
        }
        return sb;
    }
}*/
import java.util.*;
public class typewrite{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
               st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){  
                String str="";         
             while(st.peek()!='('){                
                str=str+st.pop();
            } 
            st.pop();
            for(int j=0;j<str.length();j++){
                st.push(str.charAt(j));
            }               
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
        res=st.pop()+res;
        }
        System.out.println(res);
        sc.close();
    }
}
