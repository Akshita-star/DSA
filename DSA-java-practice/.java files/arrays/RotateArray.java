//right and left
import java.util.Scanner;

public class RotateArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n; // in case k > n

        // //right
        //  reverse(arr, n - k, n - 1);   // step1
        //  reverse(arr, 0, n - k - 1);   // step2
        //  reverse(arr, 0, n - 1);       // step3

         //left
         reverse(arr, 0, n - 1); 
          reverse(arr, n - k, n - 1);   // step1
         reverse(arr, 0, n - k - 1);   // step2
               // step3




        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.print(arr[i]);
            else System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
