/*
 * /*
Mr. Gnanesh is working with words. He has given a list of words. 
Each word in the list contains only two lowercase letters [a-z].

He wants to create the biggest word BW, by concatenating words from the list, which 
is a palindrome too. He is allowed to use each word from the list at most once.

Return the length of the biggest word that can be formed using the list.
If it is impossible to create a such word, return 0.

Input Format:
-------------
Space separated strings, words[], two letter words.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
ab ba dd

Sample Output-1:
----------------
6

Explanation: 
------------
The biggest word is, ab,dd,ba => abddba, which is a palindrome.


Sample Input-2:
---------------
pq rs sr mk km pq

Sample Output-2:
----------------
8

Explanation: 
------------
The biggest word is, rs,sr,mk,km => rsmkkmsr or mkrssrkm..etc, 
which is a palindrome.


Sample Input-3:
---------------
aa bb cc

Sample Output-3:
----------------
2

 */
/*import java.util.*;
class palin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        HashSet<String>hs=new HashSet<>();
        for(String x:s){
            hs.add(x);
        }
        ArrayList<String>arr=new ArrayList<>();
        for(String t:hs){
            arr.add(t);
        }
        int res=0,flag=0;
        for(int i=0;i<arr.size();i++){
            char a=arr.get(i).charAt(0);
            char b=arr.get(i).charAt(1);
            if(a==b && flag==0){
                res=res+2;
                flag=1;
            }
            for(int j=i+1;j<arr.size();j++){
              char x=arr.get(j).charAt(0);
              char y=arr.get(j).charAt(1);
              if(a==y && b==x){
                  res=res+4;
              }
            }
        }
        System.out.println(res);
    }
}*/
import java.util.*;
public class Longestpal{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String i:a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int l=0;
        int c=0;
        int f=0;
        for(String i:hm.keySet()){
            StringBuilder sb=new StringBuilder(i);
            sb.reverse();
            if(i.equals(sb.toString())){
                c=hm.get(i);
                if(c%2!=0){
                    c--;
                    f=1;
                }
                l+=c*2;
            }
            else if(hm.containsKey(sb.toString())){
                l+=(Math.min(hm.get(i),hm.get(sb.toString())))*4;
                hm.replace(i,0);
            }
        }
        if(f==1){
            l+=2;
        }
        System.out.println(l);
    }
}
