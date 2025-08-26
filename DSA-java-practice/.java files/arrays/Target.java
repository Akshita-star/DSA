//return index of target or the index it would have been on if in acending order
import java.util.*;
public class Target {
    class Solution {
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=searchInsert(arr,target);
        System.out.println(j);
        
        }
    public int searchInsert(int[] arr, int num) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]>num){
                    high=mid-1;
            }
            else{             
                    low=mid+1;
                }
        }
        return low;
    }
        
}
    
}
