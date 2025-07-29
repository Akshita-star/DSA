import java.util.Scanner;
public class Pattern9MixingAlpAndNumInReverse {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
            char ch='A';
            for(int j = 1; j<=n+1-i;j++) {
                if(n%2!=0){
                    if(i%2==0){
                        System.out.print(ch);
                        ch++;
                    }
                    else{
                    System.out.print(j);
                    }
                }
                else{
                    if(i%2!=0){
                        System.out.print(ch);
                        ch++;
                    }
                    else{
                    System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
}



