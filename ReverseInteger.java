
import java.util.Scanner;

public class ReverseInteger {
      public static int reverse(int x) {
            long rev = 0;
            while (x != 0) {
                  int digit = x % 10;
                  rev = rev * 10 + digit;
                  x = x / 10;

            }
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                  return 0;
            return (int) rev;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(reverse(n));
      }
}
