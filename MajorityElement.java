import java.util.Scanner;

public class MajorityElement {
      public static int majorityElement(int[] nums) {
            int candidate = 0;
            int freq = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                  if (freq == 0) {
                        candidate = nums[i];
                        freq = 1;
                  } else if (nums[i] == candidate) {
                        freq++;
                  } else {
                        freq--;
                  }
            }
            return candidate;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(majorityElement(nums));

      }

}
