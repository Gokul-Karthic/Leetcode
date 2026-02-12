import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionofTwoArray {
      public static int[] intersection(int[] nums1, int[] nums2) {
            List<Integer> res = new ArrayList<>();
            for (int i : nums1) {
                  for (int j : nums2) {
                        if (i == j) {
                              res.add(j);
                              break;
                        }
                  }
            }
            int[] ans = new int[res.size()];
            int k = 0;
            for (int i : res) {
                  ans[k++] = i;
            }
            return ans;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums1 = new int[n];
            for (int i = 0; i < n; i++) {
                  nums1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] nums2 = new int[m];
            for (int i = 0; i < n; i++) {
                  nums2[i] = sc.nextInt();
            }
            int[] ans = intersection(nums1, nums2);
            for (int i : ans) {
                  System.out.println(i);
            }

      }

}
