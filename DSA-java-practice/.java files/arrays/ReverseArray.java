import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    public static void reverse(int[]arr,int n){
        int i=0,j=n-1,temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
}