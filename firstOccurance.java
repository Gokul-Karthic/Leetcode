
import java.util.Scanner;

public class firstOccurance {
      public static int strStr(String haystack, String needle) {
            if (needle.length() == 0)
                  return 0;
            int p1 = 0;
            int p2 = 0;

            while (p2 < haystack.length()) {
                  if ((p1 < needle.length()) && (haystack.charAt(p2) == needle.charAt(p1))) {
                        p1++;
                        p2++;
                        if (p1 == needle.length()) {
                              return p2 - p1;
                        }
                  } else {
                        p2 = p2 - p1 + 1;
                        p1 = 0;
                  }
            }
            return -1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String haystack = sc.next();
            String needle = sc.next();
            int ans = strStr(haystack, needle);
            System.out.println(ans);
            sc.close();
      }

}
