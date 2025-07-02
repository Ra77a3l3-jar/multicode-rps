public class gamEngine {

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
}
