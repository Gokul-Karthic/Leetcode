
import java.util.Scanner;

public class MaximumSubstringsWithDistinctStart {
      public static int maxDistinct(String s) {
            int freq[] = new int[26];
            for (char ch : s.toCharArray()) {
                  freq[ch - 'a']++;
            }
            int c = 0;
            for (int i = 0; i < 26; i++) {
                  if (freq[i] > 0)
                        c++;
            }
            return c;
            // HashMap<Character, Integer> map = new HashMap<>();
            // for (char ch : s.toCharArray()) {
            // if (!map.containsKey(ch)) {
            // map.put(ch, 1);
            // } else {
            // map.put(ch, map.get(ch) + 1);
            // }
            // }
            // return map.size();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(maxDistinct(s));
      }

}
