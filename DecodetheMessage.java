import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecodetheMessage {

      public static String decodeMessage(String key, String message) {
            Map<Character, Character> map = new HashMap<>();
            char currentChar = 'a';

            for (char ch : key.toCharArray()) {
                  if (ch != ' ' && !map.containsKey(ch)) {
                        map.put(ch, currentChar++);
                  }
            }

            StringBuilder decoded = new StringBuilder();
            for (char ch : message.toCharArray()) {
                  if (ch == ' ') {
                        decoded.append(' ');
                  } else {
                        decoded.append(map.get(ch));
                  }
            }

            return decoded.toString();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String key = sc.next();
            String message = sc.next();
            System.out.println(decodeMessage(key, message));
      }
}
