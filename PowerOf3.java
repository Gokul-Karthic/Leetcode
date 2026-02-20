import java.util.Scanner;

public class PowerOf3 {
      public static boolean isPowerOfThree(int n) {

            if (n == 0) {
                  return false;
            }
            while (n != 1) {
                  if (n % 3 != 0) {
                        return false;
                  }
                  n = n / 3;
            }
            return true;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isPowerOfThree(n));
      }

}
