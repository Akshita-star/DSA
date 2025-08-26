import java.util.Scanner;
public class Sort0And1Array{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),i=0;
    int[] arr=new int[n];
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if((arr[i]!=0)&&(arr[i]!=1)){
             System.out.println("wrong array passed");
                      return;

        }
    }

    //METHOD 1-->willl go for interview


    // int countzero=0;
    // for(i=0;i<n;i++){
    //     if(arr[i]==0){
    //         countzero++;
    //     }
    //  } 
    //if we get number of zeroes then we know no of ones automaticaly
    // for(i=0;i<n;i++){
    // if(i<countzero){
    //    arr[i]=0;
    // }else{
    //     arr[i]=1;
    // }  
    // }

    //METHOD 2

   int low = 0, high = n-1;
        while(low < high){
            if(arr[low] == 0){
                low++;
            } 
            else if(arr[high] == 1){
                high--;
            }
            else {
                // swap 1 (left) with 0 (right)
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }
}


    
}
