import java.util.Scanner;

public class DecodeXORedArray {
      public static int[] decode(int[] encoded, int first) {
            int[] arr = new int[encoded.length + 1];
            arr[0] = first;
            int j = 0;
            for (int i = 1; i < arr.length; i++) {
                  arr[i] = encoded[j++] ^ arr[i - 1];
            }
            return arr;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] encoded = new int[n];
            for (int i = 0; i < n; i++) {
                  encoded[i] = sc.nextInt();
            }
            int first = sc.nextInt();
            int[] ans = decode(encoded, first);
            for (int i = 0; i < n; i++) {
                  System.out.println(ans[i]);
            }

      }

}