
import java.util.Scanner;

public class ReversePrefixofWord {
      public static String reversePrefix(String word, char ch) {
            if (word.indexOf(ch) != -1) {
                  StringBuilder sb = new StringBuilder();
                  // int p1 = 0;
                  // for (int i = 0; i < word.length(); i++) {
                  // if (word.charAt(i) == ch) {
                  // break;
                  // } else {
                  // p1++;
                  // }
                  // }
                  int p1 = word.indexOf(ch);
                  int c1 = p1;
                  sb.append(ch);
                  while (--p1 >= 0) {
                        sb.append(word.charAt(p1));
                  }
                  for (int j = c1 + 1; j < word.length(); j++) {
                        sb.append(word.charAt(j));
                  }

                  return sb.toString();

            }
            return word;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.next();
            char ch = sc.next().charAt(0);
            System.out.println(reversePrefix(word, ch));
      }

}
