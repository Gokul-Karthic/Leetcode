import java.util.Scanner;

public class FairCandySwap {
      public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int AT = 0;
            int BT = 0;
            int n = aliceSizes.length;
            int m = bobSizes.length;
            int[] ans = new int[2];
            for (int i : aliceSizes) {
                  AT += i;
            }
            for (int i : bobSizes) {
                  BT += i;
            }
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        if ((AT - aliceSizes[i] + bobSizes[j]) == (BT - bobSizes[j] + aliceSizes[i])) {
                              ans[0] = aliceSizes[i];
                              ans[1] = bobSizes[j];
                        }
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] alice = new int[n];
            for (int i = 0; i < n; i++) {
                  alice[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] bob = new int[n];
            for (int i = 0; i < n; i++) {
                  bob[i] = sc.nextInt();
            }
            int[] ans = fairCandySwap(alice, bob);
            for (int i : ans) {
                  System.out.println(i);
            }

      }

}
