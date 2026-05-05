import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofValuesatIndicesWithKSetBits {
      public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                  String s = Integer.toBinaryString(i);
                  int count = 0;
                  for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == '1') {
                              count++;
                        }
                  }
                  if (count == k) {
                        sum += nums.get(i);
                  }
            }
            return sum;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            List<Integer> nums = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  nums.set(i, sc.nextInt());
            }
            int k = sc.nextInt();
            System.out.println(sumIndicesWithKSetBits(nums, k));
      }

}
