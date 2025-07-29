import java.util.Scanner;
public class Pattern19NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++){
                System.out.print(p);
            }
            for(int q=i-1;q>=1;q--){
                System.out.print(q);
            }
            System.out.println();
        }
    }
    
}
