
import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
      public static char nextGreatestLetter(char[] letters, char target) {
            for (int i = 0; i < letters.length; i++) {
                  if (letters[i] > target) {
                        return letters[i];
                  }
            }
            return letters[0];
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char target = sc.next().charAt(0);
            char[] letters = new char[n];
            for (int i = 0; i < n; i++) {
                  letters[i] = sc.next().charAt(0);
            }
            char ans = nextGreatestLetter(letters, target);
            System.out.println(ans);

      }

}
