import java.util.Scanner;

public class MinimumNumberofOperationstoMakeArrayXOREqualtoK {
      public static int minOperations(int[] nums, int k) {
            int xor = 0;
            int count = 0;

            for (int i : nums) {
                  xor ^= i;
            }
            while (k > 0 || xor > 0) {
                  if ((k % 2) != (xor % 2)) {
                        count++;
                  }
                  k = k / 2;
                  xor = xor / 2;
            }
            return count;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(minOperations(nums, k));
      }
}
