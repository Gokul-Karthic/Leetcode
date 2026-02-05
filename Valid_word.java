
import java.util.Scanner;

public class Valid_word {
      public static boolean isValid(String word) {
            if (word.length() < 3) {
                  return false;
            }
            int countv = 0;
            int countc = 0;
            for (char ch : word.toCharArray()) {
                  if (!Character.isLetterOrDigit(ch)) {
                        return false;
                  }
                  if (Character.isLetter(ch)) {
                        char l = Character.toLowerCase(ch);
                        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                              countv++;
                        } else {
                              countc++;
                        }
                  }
            }
            if (countv == 0 || countc == 0) {
                  return false;
            }
            return true;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(isValid(s));
      }

}
