
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Biology marks: ");
        int biology = sc.nextInt();

        System.out.print("Enter Mathematics marks: ");
        int mathematics = sc.nextInt();

        System.out.print("Enter Computer marks: ");
        int computer = sc.nextInt();

        int total = physics + chemistry + biology
                    + mathematics + computer;

        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}
