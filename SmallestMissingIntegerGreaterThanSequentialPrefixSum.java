import java.util.Arrays;
import java.util.Scanner;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
      public static int missingInteger(int[] nums) {
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                  if (nums[i - 1] + 1 == nums[i]) {
                        sum += nums[i];
                  } else {
                        break;
                  }
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                  if (sum == nums[i]) {
                        sum++;
                  }
            }
            return sum;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            System.out.println(missingInteger(arr));
      }

}
