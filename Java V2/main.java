public class main {
    
    public static void main (String[] args) {
        do {
            utils.choices();
            char player = getChoices.getPlayerChoice();
            char computer = getChoices.getComputerChoice();
            utils.displayChoices(player, computer);
            int result = gamEngine.determineWinner (player, computer);
            if (result == 0) {
                System.out.println ("The match is a tie");
            } else if (result == 1) {
                System.out.println ("Player wins the match");
            } else {
                System.out.println ("Computer wins the match");
            }
        }
        while (utils.playAgain());

        System.out.println ("Thanks for playing");
    }
}
