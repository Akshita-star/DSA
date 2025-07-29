import java.util.Scanner;
public class Pattern3AlphabetRectangle {
    public static void main(String[] args) {
        System.out.println("Enter coloumns and rows: ");
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        for(int i=1;i<=m;i++){
            char ch='A';
            for(int j=1;j<=n;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    
    }

        
}
