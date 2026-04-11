
import java.util.Scanner;

public class XOROperationinanArray {
      public static int xorOperation(int n, int start) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = start + 2 * i;
            }
            int xor = 0;
            for (int i : arr) {
                  xor ^= i;
            }
            return xor;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int start = sc.nextInt();
            System.out.println(xorOperation(n, start));
      }

}
