/*
In Turkey, an ice cream parlour gives an offer to a lucky kid.
The parlour keeps N ice cream cups in a row, and there are different flavours 
of icecreams, where i-th cup filled with the flavour[i] type of ice cream.

The kid can pick the continuous set of ice cream cups, where the cups are filled
with icecreams of at most two different flavours. The kid wants to 
pick the maximum number of ice cream cups from the row.

You will be given the integer array, flavours[] of size N.
Your task is to help the kid to pick the maximum number of ice cream cups 
with at most two different flavours.


Input Format:
-------------
Line-1: An integer, number of icecreams.
Line-2: N space separated integers, flavours[] 

Output Format:
--------------
Print an integer result, maximum number of icecream cups can be picked.


Sample Input-1:
---------------
10
1 2 3 1 1 3 3 2 3 2

Sample Output-1:
----------------
5

Explanation:
------------
The kid can pick the continuous set of icecream cups as follows: 3 1 1 3 3
Where the cups are filled with two different flavours, 1 and 3.



Sample Input-2:
---------------
10
2 1 1 3 2 1 3 0 0 3

Sample Output-2:
----------------
4
*/
/*import java.util.*;
public class Icecream
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k=0,max=Integer.MIN_VALUE;
		 HashSet<Integer>h=new HashSet<>();
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        h.add(arr[j]);
		        if(h.size()<=2){
		            k=k+1;
		        }
		        else{
		            break;
		        }
		    }
		  max=Math.max(k,max);
		  h.clear();
		  k=0;
		}
		
		System.out.println(max);
	}
}
*/
import java.util.*;
public class Icecream
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int maxi=Integer.MIN_VALUE,i=0,j=0;
		HashMap<Integer,Integer>hm=new HashMap<>(); 
		while(j<n){
		    if(hm.containsKey(arr[j])){
		        hm.put(arr[j],hm.get(arr[j])+1);
		    }
		    else{
		        hm.put(arr[j],1);
		    }
		    if(hm.size()<2){
		        j++;
		    }
		    else if(hm.size()==2){
		        maxi=Math.max(maxi,j-i+1);
		        j++;
		    }
		    else if(hm.size()>2){
		        while(hm.size()>2){
		            int freq=hm.get(arr[i]);
		            if(freq==1){
		                hm.remove(arr[i]);
		            }
		            else{
		                hm.put(arr[i],freq-1);
		            }
		            i++;
		        }
		        j++;
		    }
	}
		System.out.println(maxi);
	}
}