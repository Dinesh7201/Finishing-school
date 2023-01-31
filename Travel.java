/*
 * /*
Sri Vihaan Travels announced a family trip to Sri Nagar, for which they began 
taking reservations. They are only offering 2 and 3-seater tickets for this trip.

Each member of certain groups is identifiable by the group ID to which he or 
she belongs. Each group is uniquely identified by its group ID.

The travel administration decided that the ticket will only be issued to members of the same group. It is decided that No wasted tickets will be issued 
(i.e., If a person is alone, then he is not allowed to get a ticket).

You are given a list of integers person_id[], where person_id[i] is the group ID 
of the ith person in the list. Your objective is to determine whether fewer tickets 
should be issued to cover everyone in each group. Print -1, if it is not possible.


Input Format:
-------------
Line-1: Comma separated integers, Person's group-ID

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
1,1,3,2,2,2,1,2,2,3

Sample Output-1:
----------------
4

Explanation: 
------------
They can book the tickets for all the people, as follows:
- Issue the 3-seater ticket, to group with ID-1 of size 3.
- Issue the 2-seater ticket, to group with ID-3 of size 2.
- Issue the 3-seater ticket, to group with ID-2 of size 5.
- Issue the 2-seater ticket, to group with ID-2 of size 5.
So, you have issued 4 tickets in total.


Sample Input-2:
---------------
1,1,1,2,2,3

Sample Output-2:
----------------
-1

Explanation: 
------------
There is a group with ID-3 of size 1. 
The administration's ruling states that a single person cannot receive a ticket.
So, print -1.

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(",");
        int ar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ar[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(ar);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(!hm.containsKey(ar[i])){
                hm.put(ar[i],1);
            }
            else{
                hm.put(ar[i],hm.get(ar[i])+1);
            }
        }
       // System.out.println(hm);
       int res=0;
       for(int val:hm.values()){
           if(val==1){
               System.out.println(-1);
               System.exit(0);
           }
           else{
               res=res+val/3;
               if(val%3!=0)res++;
           }
       }
       System.out.println(res);
    }
}
