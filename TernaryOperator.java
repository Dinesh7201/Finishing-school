/*
Mr Toronto working with operators in programming language.
He is given statement S, which is a valid statement and consist of digits [0-9] 
and characters '?', ':', 'Y', 'N', where Y indiactes true and N indicates false.
And the statement conatins only numbers with single digits.
(>=10 value is not allowed)

The operator '?' works as follows:
	- if S="Y?1:2" - as Y means true, it will return 1.
	- if S="N?1:2" - as N means false, it will return 2.

Your task is to help Mr Toronto to execute the statement S and return the result.
The result must be either a digit [0-9] or "Y" or "N".

Input Format:
-------------
A string S, a valid statement.

Output Format:
--------------
Print a string, the result of the statement S.


Sample Input-1:
---------------
Y?N?3:4:2

Sample Output-1:
----------------
4

Explanation:
------------
Given statement is Y?N?3:4:2 -> Y?(N?3:4):2 
Y means "true", So you have to execute N?3:4
N means "false", So the answer is 4.


Sample Input-2:
---------------
N?Y?N?N:Y:N:Y

Sample Output-2:
----------------
Y

Explanation:
------------
Given statement is N?Y?N?N:Y:N:Y -> N?(Y?(N?N:Y):N):Y
N means "false", So the answer is Y.

*/
import java.util.*;
public class TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(Ternaryoperator(str));
    }
    public static String Ternaryoperator(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(!st.isEmpty() && st.peek()=='?'){
            st.pop();
            char start = st.pop();
            st.pop();
            char end = st.pop();
            if(str.charAt(i)=='Y')st.push(start);
            else
            st.push(end);
            }
            else{
                st.push(str.charAt(i));
            }
            
        }
        return st.peek().toString();
    }
}