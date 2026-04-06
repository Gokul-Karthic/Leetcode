
import java.util.HashMap;
import java.util.Scanner;

public class CheckiftheSentenceIsPangram {
      public static boolean checkIfPangram(String sentence) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : sentence.toCharArray()) {
                  if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                  } else {
                        map.put(c, 1);
                  }
            }
            return map.size() == 26;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(checkIfPangram(s));

      }

}
