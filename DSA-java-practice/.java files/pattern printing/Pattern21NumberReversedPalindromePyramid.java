import java.util.Scanner;
public class Pattern21NumberReversedPalindromePyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= i - 1; k++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= n - i; k++) {
                System.out.print(k + " ");//for spaces between
            }
            for(int k = n - i + 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}

    

