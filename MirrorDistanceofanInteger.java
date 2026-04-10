
import java.util.Scanner;

public class MirrorDistanceofanInteger {
      public static int mirrorDistance(int n) {
            int mirror = n;

            int rev = 0;
            while (n != 0) {
                  int temp = n % 10;
                  rev = rev * 10 + temp;
                  n /= 10;
            }
            mirror = Math.abs(mirror - rev);
            return mirror;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(mirrorDistance(n));
      }

}
