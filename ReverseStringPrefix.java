
import java.util.Scanner;

public class ReverseStringPrefix {
      public static String reversePrefix(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = k - 1; i >= 0; i--) {
                  sb.append(s.charAt(i));
            }
            for (int i = k; i < s.length(); i++) {
                  sb.append(s.charAt(i));
            }
            return sb.toString();
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(reversePrefix(s, k));

      }
}
