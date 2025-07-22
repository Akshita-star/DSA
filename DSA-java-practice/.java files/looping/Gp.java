import java.util.Scanner;
public class Gp{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=1;
        int r=2;
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=1;j<=i-1;j++){
                p*=r;
            }
            System.out.println(a*p);
        }

    }
}