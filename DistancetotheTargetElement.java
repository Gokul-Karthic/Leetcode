import java.util.Scanner;

public class DistancetotheTargetElement {
      public static int getMinDistance(int[] nums, int target, int start) {
            int ans = nums.length;
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == target) {
                        ans = Math.min(ans, Math.abs(i - start));
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int start = sc.nextInt();
            System.out.println(getMinDistance(nums, target, start));

      }
}
