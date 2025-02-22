import java.util.HashMap;
import java.util.Scanner;

public class Player {
    public static HashMap<String, Integer> scores = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void printScores() {
        for(String s : scores.keySet()) {
            int val = scores.get(s);
            System.out.println(s + " has a score of " + val);
        }
    }

    public static void updateScores() {
        HashMap<String, Integer> copy = new HashMap<>(scores);
        for(String s : copy.keySet()) {
            System.out.print(s + " gets ");
            try {
                int input = Integer.parseInt(scan.nextLine());
                if(scores.get(s) + input >= 251) {
                    System.out.println(s + " is eliminated with a score of " + scores.get(s));
                    scores.remove(s);
                } else {
                    scores.put(s, scores.get(s) + input);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount!");
            }
        }
    }
}
