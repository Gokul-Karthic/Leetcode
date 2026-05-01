import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindIndicesofStableMountains {
      public static List<Integer> stableMountains(int[] height, int threshold) {
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i < height.length; i++) {
                  if (height[i - 1] > threshold) {
                        l.add(i);
                  }
            }

            return l;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int threshold = sc.nextInt();
            System.out.println(stableMountains(arr, threshold));
      }
}
