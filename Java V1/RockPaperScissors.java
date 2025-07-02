import java.lang.Character;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void choices () {
        System.out.println ("Rock - Paper - Scissors Game!");
        System.out.println ("Enter: (r)ock, (p)aper or (s)cissors");
    }

    public static char getPlayerChoice () {
        Scanner scanf = new Scanner(System.in);
        char choice;
        
        while (true) {
            System.out.println ("Enter your choice: ");
            choice = scanf.next().charAt(0);

            choice = Character.toLowerCase(choice);

            if (choice == 'r' || choice == 'p' || choice == 's') {
                break;
            }
            System.out.println ("Wrong input try again");
        }
        return choice;
    }

    public static char getComputerChoice () {
        Random rand = new Random();
        int random = rand.nextInt(3);

        switch (random) {
            case 0:
            return 'r';
            case 1:
            return 'p';
            default:
            return 's';
        }
    }

    public static void displayChoices (char player, char computer) {
        System.out.println ("You choose: ");
            switch (player) {
                case 'r':
                System.out.println ("Rock");
                break;
                case 'p':
                System.out.println ("Paper");
                break;
                default:
                System.out.println ("Scissors");
                break;
            }

        System.out.println ("The computer choose: ");
            switch (computer) {
                case 'r':
                System.out.println ("Rock");
                break;
                case 'p':
                System.out.println ("Paper");
                break;
                default:
                System.out.println ("Scissors");
                break;
            }
    }

    public static int determineWinner (char player, char computer) {
        if (player == computer) {
            return 0;
        }

        if ((player == 'r' && computer == 's') ||
            (player == 'p' && computer == 'r') ||
            (player == 's' && computer == 'p')) {
                return 1;
            }

        return -1;
    }

    public static boolean playAgain () {
        Scanner scanf = new Scanner(System.in);
        char choice;

        System.out.println ("Do you want to play again? ");
        choice = scanf.next().charAt(0);
        choice = Character.toLowerCase(choice);

        return (choice == 'y');
    }
    
    public static void main (String[] args) {
        do {
            choices();
            char player = getPlayerChoice();
            char computer = getComputerChoice();
            displayChoices(player, computer);
            int result = determineWinner (player, computer);
            if (result == 0) {
                System.out.println ("The match is a tie");
            } else if (result == 1) {
                System.out.println ("Player wins the match");
            } else {
                System.out.println ("Computer wins the match");
            }
        }
        while (playAgain());

        System.out.println ("Thanks for playing");
    }
}
