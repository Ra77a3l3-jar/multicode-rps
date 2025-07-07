#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <ctype.h>
#include <stdbool.h>

void choice () {
    printf ("Rock - Paper - Scissors Game!\n");
    printf ("Enter: (r)ock, (p)aper or (s)cissors\n");
}

char getPlayerChoice () {
    char choice;

    while (true) {
        printf ("Enter your choice: \n");
        scanf (" %c", &choice);

        choice = tolower(choice);

        if (choice == 'r' || choice == 'p' || choice == 's') {
            return choice;
            break;
        }
        printf ("Wrong input try again\n");
    }
}

char getComputerChoice () {
    int random = rand()% 3;
        switch (random) {
            case 0:
                return 'r';
            case 1:
                return 'p';
            default:
                return 's';
        }
}

void displayChoices (char player, char computer) {
    printf ("You choose: ");

    switch (player) {
        case 'r':
            printf ("Rock\n");
            break;
        case 'p':
            printf ("Paper\n");
            break;
        case 's':
            printf ("Scissors\n");
            break;
    }

    printf ("The computer choose: ");
    switch (computer) {
        case 'r':
            printf ("Rock\n");
            break;
        case 'p':
            printf ("Paper\n");
            break;
        case 's':
            printf ("Scissors\n");
            break;
    }
}

int playGame (char player, char computer) {
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

bool playAgain () {
    char choice;

    printf ("Do you want to play again? \n");
    scanf (" %c", &choice);

    choice = tolower(choice);

    return (choice == 'y');
}

int main(void) {
    srand(time(NULL));

    do  {
        choice();
        char player = getPlayerChoice();
        char computer = getComputerChoice();
        displayChoices(player, computer);
        int result = playGame(player, computer);
        if (result == 0) {
            printf ("It's a tie!\n");
        } else if (result == 1) {
            printf ("Player wins!\n");
        } else {
            printf ("Computer wins!\n");
        }
    }while(playAgain());

    printf ("Thanks for playing\n");
    
    return 0;
}
