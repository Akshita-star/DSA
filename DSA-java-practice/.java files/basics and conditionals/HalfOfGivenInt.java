import java.util.Scanner;
public class HalfOfGivenInt{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double y=(double)n;//as it will given half of 5 as 2 so we have to typecast
        System.out.println(y/2);
    }
}