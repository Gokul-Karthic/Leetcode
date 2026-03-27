import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindWordsContainingCharacter {
      public static List<Integer> findWordsContaining(String[] words, char x) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                  if (words[i].contains(String.valueOf(x))) {
                        arr.add(i);

                  }
            }
            return arr;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                  words[i] = sc.nextLine();
            }
            char x = sc.next().charAt(0);
            List<Integer> result = findWordsContaining(words, x);
            System.out.println(result);
      }
}
