import java.util.Scanner;

public class StrictlyPalindromicNumber {
      public static boolean isStrictlyPalindromic(int n) {
            boolean flag = true;
            for (int i = 2; i < n - 1; i++) {
                  if (!check(Integer.toString(n, i))) {
                        flag = false;
                        break;
                  }
            }
            return flag;
      }

      public static boolean check(String n) {
            int left = 0;
            int right = n.length() - 1;
            while (left < right) {
                  if (n.charAt(left) != n.charAt(right))
                        return false;
                  left++;
                  right--;
            }
            return true;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isStrictlyPalindromic(n));

      }
}
