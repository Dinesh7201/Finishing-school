/*
 * /* Given a string s, .reverse only all the vowels in the 
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
class vow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                st.push(x);
                str.append('_');
            }
            else{
                str.append(x);
            }
        }
        String r=str.toString();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<r.length();i++){
            char y=r.charAt(i);
            if(y=='_'){
                res.append(st.peek());
                st.pop();
            }
            else{
                res.append(y);
            }
        }
        System.out.println(res);
    }
}