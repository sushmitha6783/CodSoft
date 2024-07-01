import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnum = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (randomnum == num) {
                System.out.println("You won the challenge!");
                break;
            } else if (randomnum > num) {
                System.out.println("It's too low.");
            } else {
                System.out.println("It's too high.");
            }

            int attemptsLeft = 10 - i;
            if (attemptsLeft > 0) {
                System.out.println("You have " + attemptsLeft + " attempts left.");
            } else {
                System.out.println("Your chances are over. The correct number was: " + randomnum);
            }
        }

        scanner.close();
    }
}
