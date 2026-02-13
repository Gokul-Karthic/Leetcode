import java.util.HashSet;
import java.util.Scanner;

public class FirstLettertoAppearTwice {
      public static char repeat(String s) {
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                  if (set.contains(c)) {
                        return c;
                  } else {
                        set.add(c);
                  }
            }
            return 'a';
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            char ans = repeat(s);
            System.out.println(ans);

      }

}
