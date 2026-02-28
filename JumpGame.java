import java.util.Scanner;

public class JumpGame {
      public static boolean canJump(int[] nums) {
            int maxReach = 0;
            int n = nums.length;

            for (int i = 0; i < n; ++i) {
                  if (i > maxReach) {
                        return false;
                  }
                  maxReach = Math.max(maxReach, i + nums[i]);
                  if (maxReach >= n - 1) {
                        return true;
                  }
            }
            return false;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(canJump(nums));

      }

}
