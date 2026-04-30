
import java.util.Scanner;

public class MaximumNumberofWordsFoundinSentences {
      public static int mostWordsFound(String[] sentences) {
            int max = 0;
            for (int i = 0; i < sentences.length; i++) {
                  int count = 0;
                  String s = sentences[i];
                  String[] arr = s.split(" ");
                  count = arr.length;
                  max = Math.max(count, max);

            }
            return max;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.next();
            }
            System.out.println(mostWordsFound(arr));
      }

}
