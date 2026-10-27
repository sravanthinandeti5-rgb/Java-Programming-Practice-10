
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }

        sc.close();
    }
}
