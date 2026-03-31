import java.util.Scanner;

public class TransformArraybyParity {
      public static int[] transformArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] % 2 == 0) {
                        nums[i] = 0;
                  } else {
                        nums[i] = 1;
                  }
            }
            int c1 = 0;
            int c0 = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == 0) {
                        c0++;
                  } else {
                        c1++;
                  }
            }
            for (int i = 0; i < nums.length; i++) {
                  if (i < c0) {
                        nums[i] = 0;
                  } else {
                        nums[i] = 1;
                  }
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
            int[] ans = transformArray(arr);
            for (int i : ans) {
                  System.out.println(i);
            }
      }
}
