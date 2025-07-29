import java.util.Scanner;
public class Pattern8MixingAlphabetAndNumberTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
    
}
