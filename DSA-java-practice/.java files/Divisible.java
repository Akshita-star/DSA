//check if number divisble by 5 or 11
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%5==0||n%11==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
