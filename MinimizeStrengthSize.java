import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimizeStrengthSize {
      public static int minimizedStringLength(String s) {
            Set<Character> set = new HashSet<>();

            for (char c : s.toCharArray()) {
                  set.add(c);
            }
            return set.size();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(minimizedStringLength(s));
      }
}
