import java.util.Scanner;
import java.lang.Character;

public class utils {
    
    public static void choices () {
        System.out.println ("Rock - Paper - Scissors Game!");
        System.out.println ("Enter: (r)ock, (p)aper or (s)cissors");
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

    public static boolean playAgain () {
        Scanner scanf = new Scanner(System.in);
        char choice;

        System.out.println ("Do you want to play again? ");
        choice = scanf.next().charAt(0);
        choice = Character.toLowerCase(choice);

        return (choice == 'y');
    }   
}
