/*There are 10 poles in a line numbered from 0 to 9, and there are a bunch of bulbs, each bulb omits any one of the given color light, color-A, color-B, color-C.
All bulbs are fixed to all the 10 poles. You have given the arrangement as a string, consists of letters ABC and digits0-9(i.e., pole numbers).
For example, A1B2C1A2, indicates, 
A color bulb is fixed to pole-1, B color bulb is fixed to pole-2
C color bulb is fixed to pole-1, A color bulb is fixed to pole-2.

Your task is to find the number of poles, that are fixed with all three different color bulbs.
Input Format:
------------------
A String S, the arrangement. 

Output Format:
--------------------
Print an integer result.


Sample Input-1:
---------------------
C0C6B0A6A0A6B9

Sample Output-1:
----------------------
1

Explanation: 
----------------
Pole-0 fixed with 3 bulbs omits all colors: A, B, and C.
Pole-6 fixed with 3 bulbs, but omits only 2 colors, A and C.
Pole-9 fixed with only 1 bulb.
Thus, the number of poles fixed with the bulbs whihc omits 
all three colors is 1.


Sample Input-2:
---------------------
A1B2C1A2

Sample Output-2:
----------------------
0
*/
import java.util.*;
class CountBulbs
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Integer,Integer> m1=new HashMap<>();
        Map<Integer,Integer> m2=new HashMap<>();
        Map<Integer,Integer> m3=new HashMap<>();
       
        for(int i=0;i<s.length()-1;i++)
        {
            
            if(s.charAt(i)=='A')
            {
                int a=s.charAt(i+1)-'0';
                m1.put(a,1);
            }
            if(s.charAt(i)=='B')
            {
                int a=s.charAt(i+1)-'0';
                m2.put(a,1);
            }
            if(s.charAt(i)=='C')
            {
                int a=s.charAt(i+1)-'0';
                m3.put(a,1);
            }
        }
        int cnt=0;
        
        for(int k:m1.keySet())
        {
            if(m2.containsKey(k) && m3.containsKey(k))
                cnt++;
            
        }
        System.out.println(cnt);
    }
}