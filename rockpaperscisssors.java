import java.util.Random;
import java.util.Scanner;

public class rockpaperscisssors {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rounds; i++) {
            playrockpaperscissors(scanner);
            String rock;
            String paper;
            String scissors;
        }


    }
      static void playrockpaperscissors(Scanner scanner) {
        System.out.println("Make a move! (rock / paper /scissors)");

        String playerMove = scanner.nextLine();
        if (playerMove.equals("rock") ||playerMove.equals("paper")|| playerMove.equals("scissors")){
        }else {
            System.out.println("Incorrect choice");
        }

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "Scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // To know who wins
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        }else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins!");
        }else {
            System.out.println("Computer wins!");
        }
    }
    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");

        }
    }
}
