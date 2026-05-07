import java.util.Scanner;

public class SumofVariableLengthSubarrays {
      public static int subarraySum(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                  int start = Math.max(0, i - nums[i]);
                  for (int j = start; j <= i; j++) {
                        sum += nums[j];
                  }
            }
            return sum;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(subarraySum(nums));
      }

}
