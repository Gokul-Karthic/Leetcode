import java.util.Scanner;

public class FindthePrefixCommonArrayofTwoArrays {
      public static int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                  int count = 0;
                  for (int j = 0; j <= i; j++) {
                        for (int k = 0; k <= i; k++) {
                              if (A[j] == B[k]) {
                                    count++;
                                    break;
                              }
                        }
                  }
                  ans[i] = count;
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
            int[] ans = findThePrefixCommonArray(nums1, nums2);
            for (int i : ans) {
                  System.out.println(i);
            }
      }

}
