import java.util.Arrays;
import java.util.Scanner;

public class TheTwoSneakyNumbersofDigitville {

      public static int[] getSneakyNumbers(int[] nums) {
            Arrays.sort(nums);
            int j = 1;
            int[] ans = new int[2];
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (j < nums.length) {
                        if (nums[i] == nums[j]) {
                              ans[k++] = nums[i];
                              j++;
                        } else {
                              j++;
                        }
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
            int[] ans = getSneakyNumbers(arr);
            for (int i : ans) {
                  System.out.println(i);
            }
      }
}
