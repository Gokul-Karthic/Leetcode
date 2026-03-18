
import java.util.Scanner;

public class FindtheMaximumAchievableNumber {
      public static int theMaximumAchievableX(int num, int t) {
            return num + 2 * t;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(theMaximumAchievableX(n, k));
      }

}
