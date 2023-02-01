/* Given an integer array of nums and an integer X(Window size -1), 
return true if there are duplicate values in that Window(X)
X size is always <= abs(i - j)    where i and j are two two 
distinct indices of array.

Sample Input/output
------------------
input:
--------------
array size
array elements
X   
output:
-----------
true

Example 1:
Input: 4            
1 2 3 1  
3       
Output: true

case 2:
Input: 6
1 2 3 1 2 3
2
Output: false
*/


import java.util.*;
public class Duplicate_Window
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        
        int i=0;
        int u=0;
        while(i<n-m){
            int flag=0;
            Map<Integer,Integer>h=new HashMap<>();
            for(int j=i;j<i+m+1;j++){
                if(h.get(arr[j])==null){
                    h.put(arr[j],1);
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println(true);
                u=1;
                break;
            }
            i++;
        }
        if(u==0){
            System.out.println(false);
        }
    }
}