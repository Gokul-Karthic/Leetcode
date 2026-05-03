
import java.util.Scanner;

public class TruncateSentence {
      public static String truncateSentence(String s, int k) {
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                  sb.append(arr[i]).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(truncateSentence(s, k));
      }

}
