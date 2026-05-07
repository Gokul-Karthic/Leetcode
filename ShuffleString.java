import java.util.Scanner;

public class ShuffleString {
      public static String restoreString(String s, int[] indices) {
            char[] res = s.toCharArray();
            for (int i = 0; i < indices.length; i++) {
                  res[indices[i]] = s.charAt(i);
            }
            return new String(res);

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n = sc.nextInt();
            int[] indices = new int[n];
            for (int i = 0; i < n; i++) {
                  indices[i] = sc.nextInt();
            }
            System.out.println(restoreString(s, indices));
      }

}
