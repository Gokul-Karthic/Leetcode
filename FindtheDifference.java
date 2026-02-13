
import java.util.Scanner;

public class FindtheDifference {
      public static char FindtheDifference(String s, String t) {
            int result = 0;
            for (char c : t.toCharArray()) {
                  result += c;
            }
            for (char c : s.toCharArray()) {
                  result -= c;
            }
            return (char) result;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            char ans = FindtheDifference(s, t);
            System.out.println(ans);
      }
}
