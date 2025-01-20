import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: (1 = Rock, 2 = Paper, 3 = Scissors)");
        int userChoice = input.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice! Please run the program again and enter a value between 1 and 3.");
            return;
        }

        String[] choices = {"Rock", "Paper", "Scissors"};
        String userChoiceString = choices[userChoice - 1];
        String computerChoiceString = choices[computerChoice - 1];

        System.out.println("You chose: " + userChoiceString);
        System.out.println("The computer chose: " + computerChoiceString);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }

        input.close();
    }
}
