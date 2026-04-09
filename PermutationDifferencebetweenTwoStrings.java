
import java.util.Scanner;

public class PermutationDifferencebetweenTwoStrings {
      public static int findPermutationDifference(String s, String t) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                  sum += Math.abs(i - t.indexOf(s.charAt(i)));

            }
            return sum;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            System.out.println(findPermutationDifference(s, t));
      }

}
