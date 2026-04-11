import java.util.Scanner;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
      public static int[] smallerNumbersThanCurrent(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                  int count = 0;
                  for (int j = 0; j < n; j++) {
                        if (nums[j] < nums[i]) {
                              count++;
                        }
                  }
                  ans[i] = count;
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
            int[] ans = smallerNumbersThanCurrent(nums);
            for (int i : ans) {
                  System.out.println(i);
            }

      }

}
