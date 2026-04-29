
import java.util.Scanner;

public class FinalArrayStateAfterKMultiplicationOperationsI {
      public static int[] getFinalState(int[] nums, int k, int multiplier) {
            for (int j = 0; j < k; j++) {
                  int num = nums[0];
                  int index = 0;
                  for (int i = 1; i < nums.length; i++) {
                        if (nums[i] < num) {
                              num = nums[i];
                              index = i;
                        }
                  }
                  nums[index] = nums[index] * multiplier;
            }
            return nums;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int mul = sc.nextInt();
            int[] ans = getFinalState(arr, k, mul);
            for (int i : ans) {
                  System.out.println(i);
            }

      }

}
