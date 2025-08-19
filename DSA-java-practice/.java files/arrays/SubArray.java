//retrieve all possible subarrays
import java.util.Scanner;
public class SubArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int start=i,end=i;
            while(end<n){
                System.out.print("("); 
                for(int j=start;j<=end;j++){
                    System.out.print(arr[j]+", ");

                }
                System.out.print(")");  
                System.out.print(" , ");         
                end++;
            }
            System.out.println();
        }
    
    }
}