/*
Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script. Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 


Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y*/

import java.util.*;
public class Vowel
{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
	    String x="aeiouAEIOU";
	    StringBuilder res=new StringBuilder();
	    for(int j=0;j<s.length;j++){
	      for(int i=0;i<s[j].length();i++){
	        if(x.indexOf(s[j].charAt(i))==-1){
	            res.append(s[j].charAt(i));
	            res.append('#');
	            res.append(s[j].charAt(i));
	        }
	        else if(x.indexOf(s[j].charAt(i))!=-1){
	            res.append(s[j].charAt(i));
	        }
	      }
	    res.append(" ");
	    }
	    System.out.println(res.toString());
	}
}