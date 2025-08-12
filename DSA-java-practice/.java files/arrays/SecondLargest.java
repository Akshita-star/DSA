import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int second_max=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=max&&arr[i]>second_max){
                second_max=arr[i];
            }
        }
        System.out.println(max+"  "+second_max);
    }
}
    
