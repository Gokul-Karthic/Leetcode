import java.util.Scanner;

public class DifferenceBetweenElementSumandDigitSumofanArray {
      public static int differenceOfSum(int[] nums) {
            int ds = 0;
            int es = 0;
            for (int i = 0; i < nums.length; i++) {
                  es += nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                  while (nums[i] > 0) {
                        int temp = nums[i] % 10;
                        ds += temp;
                        nums[i] = nums[i] / 10;
                  }
            }
            return Math.abs(es - ds);

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(differenceOfSum(nums));
      }

}
