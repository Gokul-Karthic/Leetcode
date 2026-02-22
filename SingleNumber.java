import java.util.HashSet;
import java.util.Scanner;

public class SingleNumber {
      public static int singleNumber(int[] nums) {
            HashSet<Integer> seen = new HashSet();
            for (int num : nums) {
                  if (seen.contains(num)) {
                        seen.remove(num);
                  } else {
                        seen.add(num);
                  }
            }
            return seen.iterator().next();

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            System.out.println(singleNumber(nums));

      }

}
