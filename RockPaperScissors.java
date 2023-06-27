public class RockPaperScissors {
    public static String determineWinner(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            return "Draw!";
        } else if (
                (player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
                        (player1Choice.equals("paper") && player2Choice.equals("rock")) ||
                        (player1Choice.equals("scissors") && player2Choice.equals("paper"))
        ) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    public static void main(String[] args) {
        String choice1 = "scissors";
        String choice2 = "paper";
        System.out.println(determineWinner(choice1, choice2)); // Player 1 won!

        String choice3 = "scissors";
        String choice4 = "rock";
        System.out.println(determineWinner(choice3, choice4)); // Player 2 won!

        String choice5 = "paper";
        String choice6 = "paper";
        System.out.println(determineWinner(choice5, choice6)); // Draw!
    }
}
