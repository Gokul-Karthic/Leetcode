
import java.util.Scanner;

public class SplitaStringinBalancedStrings {
      public static int balancedStringSplit(String s) {
            int balance = 0;
            int sub = 0;
            for (char c : s.toCharArray()) {
                  if (c == 'L') {
                        balance++;
                  } else {
                        balance--;
                  }
                  if (balance == 0) {
                        sub++;
                  }
            }
            return sub;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(balancedStringSplit(s));
      }

}
