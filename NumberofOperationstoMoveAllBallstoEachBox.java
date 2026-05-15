import java.util.Scanner;

public class NumberofOperationstoMoveAllBallstoEachBox {
      public static int[] minOperations(String boxes) {
            int n = boxes.length();
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                  if (boxes.charAt(i) == '1') {
                        for (int j = 0; j < n; j++) {
                              ans[j] += Math.abs(i - j);
                        }
                  }
            }
            return ans;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int[] ans = minOperations(s);
            for (int i : ans) {
                  System.out.println(i);
            }

      }
}
