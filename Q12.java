
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count;
        int total = 0;

        for (int note : notes) {
            count = amount / note;

            if (count > 0) {
                System.out.println("Rs. " + note + " = " + count);
                total += count;
                amount = amount % note;
            }
        }

        System.out.println("Total number of notes/coins = " + total);

        sc.close();
    }
}
