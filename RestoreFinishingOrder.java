import java.util.HashSet;
import java.util.Scanner;

public class RestoreFinishingOrder {
      public static int[] recoverOrder(int[] order, int[] friends) {

            HashSet<Integer> set = new HashSet<>();
            int n = friends.length;
            int[] result = new int[n];
            int index = 0;

            for (int i = 0; i < n; i++) {
                  set.add(friends[i]);
            }

            for (int i = 0; i < order.length; i++) {
                  if (set.contains(order[i])) {
                        result[index++] = order[i];
                  }
            }

            return result;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] order = new int[n];
            for (int i = 0; i < n; i++) {
                  order[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] friends = new int[m];
            for (int i = 0; i < m; i++) {
                  friends[i] = sc.nextInt();
            }

            int[] result = recoverOrder(order, friends);

            // Output result
            System.out.println("Recovered Order:");
            for (int i = 0; i < result.length; i++) {
                  System.out.print(result[i] + " ");
            }

      }
}
