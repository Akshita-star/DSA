import java.util.Scanner;
public class Sort0And1And2DutchFlagAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if((arr[i]!=0)&&(arr[i]!=1)&&(arr[i]!=2)){
                System.out.println("wrong array passed");
                return;
            }
        }
        

        // //METHOD 1
        // int zero=0,one=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         zero++;
        //     }
        //     else if(arr[i]==1){
        //         one++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(i<zero){
        //         arr[i]=0;
        //     }
        //     else if(i<zero+one){
        //         arr[i]=1;
        //     }
        //     else{
        //         arr[i]=2;
        //     }
        // }

        //METHOD 2-->DUTCH FLAG ALGORITHM-->3 POINTER (LOW,MID,HIGH)
        int low=0,mid=0,high=n-1;//unsorted-->mid to high
        while(mid<=high){

            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,high,mid);
                high--;
            }
        }
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
        
        
    }
    public static void swap(int[]arr,int high,int mid){
        int temp=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp;

    }
    
}
