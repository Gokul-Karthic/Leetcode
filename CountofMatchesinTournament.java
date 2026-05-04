import java.util.Scanner;

public class CountofMatchesinTournament {
      public static int numberOfMatches(int n) {
            int count = 0;
            int rev = 0;
            while (n > 1) {
                  rev = n / 2;
                  count += rev;
                  n = n - rev;
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(numberOfMatches(n));
      }

}
