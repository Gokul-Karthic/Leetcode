import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
      public static int lengthOfLongestSubstring(String s) {
            int i = 0;
            int j = 0;
            int maxLen = 0;
            int[] res = new int[128];

            while (j < s.length()) {
                  int ans = s.charAt(j);

                  while (res[s.charAt(j)] == 1) {
                        res[s.charAt(i)] = 0;
                        i++;
                  }

                  if (res[ans] == 0) {
                        res[ans] = 1;
                        maxLen = Math.max(maxLen, j - i + 1);
                        j++;
                  }
            }
            return maxLen;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(lengthOfLongestSubstring(s));
      }

}