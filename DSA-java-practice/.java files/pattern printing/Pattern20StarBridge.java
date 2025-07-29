import java.util.Scanner;
public class Pattern20StarBridge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int z=1;z<=2*n-1;z++){
            System.out.print("*");
        }
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n+1-i;k++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" ");
            }
             for(int k=1;k<=n+1-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
