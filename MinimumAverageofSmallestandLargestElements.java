import java.util.Arrays;
import java.util.Scanner;

public class MinimumAverageofSmallestandLargestElements {
      public static double minimumAverage(int[] nums) {
            Arrays.sort(nums);
            double minAvg = Double.MAX_VALUE;
            int j = nums.length - 1;

            for (int i = 0; i < nums.length / 2; i++) {
                  double avg = (nums[i] + nums[j]) / 2.0;
                  minAvg = Math.min(minAvg, avg);
                  j--;
            }
            return minAvg;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(minimumAverage(nums));

      }

}
