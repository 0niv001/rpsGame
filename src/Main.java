// RPS

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String player;

        do{
            System.out.println("Choose rock, paper or scissors");
            player = scanner.nextLine().toLowerCase();
        } while (player.isBlank());

        String computer = choices[random.nextInt(3)];

        if(player.equals(computer)){
            System.out.println("You both picked " + player + " it's a draw");
        }
        else if (
                (player.equals("scissors") && computer.equals("paper")) ||
                        (player.equals("rock") && computer.equals("scissors")) ||
                        (player.equals("paper") && computer.equals("rock"))) {
            System.out.println("You picked " + player + " ,computer picked " + computer+ ".You win" );
        }
        else {
            System.out.println("You picked " + player + " ,computer picked " + computer+ ".You lose" );
        }

    }
}

