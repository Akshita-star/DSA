import java.util.Scanner;
public class Sort0And1Array{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),i=0;
    int[] arr=new int[n];
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    //METHOD 1


    // int countones=0,countzero=0;
    // for(i=0;i<n;i++){
    //     if(arr[i]==0){
    //         countzero++;
    //     }
    //     else if(arr[i]==1){
    //         countones++;
    //     }
    //     else{
    //         System.out.println("wrong array passed");
    //         return;
    //     }        
    // }
    // int z=0;
    // for(i=0;i<countzero;i++){
    //     arr[z++]=0;
    // }
    // for(i=0;i<countones;i++){
    //     arr[z++]=1;
    // }

    //METHOD 2

   int left = 0, right = n-1;
        while(left < right){
            if(arr[left] == 0){
                left++;
            } 
            else if(arr[right] == 1){
                right--;
            }
            else {
                // swap 1 (left) with 0 (right)
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }
}


    
}
