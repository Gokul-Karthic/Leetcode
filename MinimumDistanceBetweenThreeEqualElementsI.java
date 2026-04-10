import java.util.Scanner;

public class MinimumDistanceBetweenThreeEqualElementsI {
      public static int minimumDistance(int[] nums) {
            int n = nums.length;
            int min = Integer.MAX_VALUE;
            if (n <= 2)
                  return -1;
            for (int i = 0; i < n - 2; i++) {
                  for (int j = i + 1; j < n - 1; j++) {
                        if (nums[i] == nums[j])
                              for (int k = j + 1; k < n; k++) {
                                    if (nums[j] == nums[k]) {
                                          int res = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                                          min = Math.min(min, res);
                                          break;
                                    }
                              }
                  }
            }
            if (min >= Integer.MAX_VALUE) {
                  return -1;
            } else {
                  return min;
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(minimumDistance(nums));
      }

}
