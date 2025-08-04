import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        return switch (rand) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String getResult(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        return switch (user + "-" + comp) {
            case "rock-scissors", "scissors-paper", "paper-rock" -> "User";
            default -> "Computer";
        };
    }

    public static void printStats(List<String[]> log) {
        int userWins = 0, compWins = 0, draws = 0;

        System.out.printf("%-10s | %-10s | %s\n", "User", "Computer", "Winner");
        System.out.println("-------------------------------------");
        for (String[] row : log) {
            System.out.printf("%-10s | %-10s | %s\n", row[0], row[1], row[2]);
            if (row[2].equals("User")) userWins++;
            else if (row[2].equals("Computer")) compWins++;
            else draws++;
        }

        int totalGames = log.size();
        double userPercent = userWins * 100.0 / totalGames;
        double compPercent = compWins * 100.0 / totalGames;

        System.out.println("\n------ Result Summary ------");
        System.out.printf("User Wins: %d (%.2f%%)\n", userWins, userPercent);
        System.out.printf("Computer Wins: %d (%.2f%%)\n", compWins, compPercent);
        System.out.printf("Draws: %d\n", draws);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String[]> resultLog = new ArrayList<>();

        System.out.print("Enter number of games: ");
        int games = in.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String user = in.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getResult(user, comp);
            resultLog.add(new String[]{user, comp, winner});
        }

        printStats(resultLog);
    }
}
