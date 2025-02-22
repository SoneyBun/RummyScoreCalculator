import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.println("Rummy Score Calculator\n");

        while(true) {
            System.out.print("Player Name: ");
            input = scan.nextLine();

            if(input.isEmpty()) {
                System.out.print("\n");
                break;
            }
            Player.scores.put(formatName(input), 0);
        }

        while(true) {
            Player.updateScores();
            System.out.println("\n");
            Player.printScores();
            if(Player.scores.size() == 1) {
                System.out.println("Game Over.");
                break;
            }
            System.out.println("\n");
        }
    }

    public static String formatName(String name) {
        String first = name.substring(0, 1);
        name = name.substring(1);
        return (first.toUpperCase() + name.toLowerCase());
    }
}