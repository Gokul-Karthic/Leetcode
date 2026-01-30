
import java.util.Scanner;

public class validPalindrome {
      public static boolean ispalindrome(String s) {
            s = s.toLowerCase();
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                  char c = s.charAt(i);
                  if (Character.isLetterOrDigit(c)) {
                        sb.append(c);
                  }
            }
            String s2 = sb.toString();
            int l = 0;
            int r = s2.length() - 1;
            while (l < r) {
                  if (s2.charAt(l) != s2.charAt(r)) {
                        return false;
                  }
                  l++;
                  r--;
            }
            return true;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(ispalindrome(s));

      }
}
