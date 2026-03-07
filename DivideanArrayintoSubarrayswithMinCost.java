
import java.util.Arrays;
import java.util.Scanner;

public class DivideanArrayintoSubarrayswithMinCost {
      public static int mincost(int[] nums) {
            int first = nums[0];
            Arrays.sort(nums, 1, nums.length);
            return first + nums[1] + nums[2];

      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int ans = mincost(arr);
            System.out.println(ans);
      }
}
