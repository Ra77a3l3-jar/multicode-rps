import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class getChoices {

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
}
