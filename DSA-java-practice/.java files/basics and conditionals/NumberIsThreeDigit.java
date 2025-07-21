import java.util.Scanner;
public class NumberIsThreeDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>99&&n<1000){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
