
import java.util.Scanner;

public class ScoreOfaString {

      public static int scoreOfString(String s) {

            int score = 0;

            for (int pos = 0; pos < s.length() - 1; pos++) {
                  score += Math.abs(s.charAt(pos) - s.charAt(pos + 1));
            }

            return score;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(scoreOfString(s));
      }
}
