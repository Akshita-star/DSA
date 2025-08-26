import java.util.*;
//unique elements should be placed first in thre list (k)rest no issue
public class UniqueArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=removeDuplicates(arr);
        System.out.println(j);
         for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }

        
    }
     public static int removeDuplicates(int[] arr) {
        int i=0,k=0;
        int n=arr.length;
        for(int j=0;j<n;j++){
           if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
           }
        }k=i+1;        
        return k;
    }
}

    

