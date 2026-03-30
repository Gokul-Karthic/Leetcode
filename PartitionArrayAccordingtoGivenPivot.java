import java.util.Scanner;

public class PartitionArrayAccordingtoGivenPivot {
      public static int[] pivotArray(int[] nums, int pivot) {
            int[] ans = new int[nums.length];
            int left = 0;
            int right = nums.length - 1;
            for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
                  if (nums[i] < pivot) {
                        ans[left] = nums[i];
                        left++;
                  }
                  if (nums[j] > pivot) {
                        ans[right] = nums[j];
                        right--;
                  }
            }
            while (left <= right) {
                  ans[left++] = pivot;
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
            int p = sc.nextInt();
            int[] ans = pivotArray(arr, p);
            for (int i : ans) {
                  System.out.println(i);
            }
      }
}
