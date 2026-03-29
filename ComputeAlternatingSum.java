import java.util.Scanner;

public class ComputeAlternatingSum {
      public static int alternatingSum(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (i % 2 == 0) {
                        ans += nums[i];
                  } else {
                        ans -= nums[i];
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            System.out.println(alternatingSum(arr));
      }
}
