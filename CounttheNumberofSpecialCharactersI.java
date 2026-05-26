import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CounttheNumberofSpecialCharactersI {
      public static int numberOfSpecialChars(String word) {
            Set<Character> s = new HashSet<>();
            for (char c : word.toCharArray()) {
                  s.add(c);
            }
            int ans = 0;
            for (char c = 'a'; c <= 'z'; c++) {
                  if (s.contains(c) && s.contains((char) (c - 'a' + 'A'))) {
                        ans++;
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(numberOfSpecialChars(s));
      }
}
