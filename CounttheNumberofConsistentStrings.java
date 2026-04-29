import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CounttheNumberofConsistentStrings {
      public static int countConsistentStrings(String allowed, String[] words) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < allowed.length(); i++) {
                  set.add(allowed.charAt(i));
            }
            int count = 0;
            for (String k : words) {
                  int flag = 1;
                  for (int i = 0; i < k.length(); i++) {
                        if (!set.contains(k.charAt(i))) {
                              flag = 0;
                              break;
                        }
                  }
                  count += flag;
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String allowed = sc.next();
            int n = sc.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                  words[i] = sc.next();
            }
            System.out.println(countConsistentStrings(allowed, words));

      }

}
