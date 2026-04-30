
import java.util.Scanner;

public class MinimumBitFlipstoConvertNumber {
      public static int minBitFlips(int start, int goal) {
            int ans = start ^ goal;
            String s = Integer.toBinaryString(ans);
            int c = 0;
            for (char ch : s.toCharArray()) {
                  if (ch == '1') {
                        c++;
                  }
            }
            return c;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            int goal = sc.nextInt();
            System.out.println(minBitFlips(start, goal));

      }
}
