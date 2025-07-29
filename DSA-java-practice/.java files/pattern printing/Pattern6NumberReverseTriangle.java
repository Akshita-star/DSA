import java.util.Scanner;
public class Pattern6NumberReverseTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+2-i;j++){
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}