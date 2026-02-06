
import java.util.Scanner;

public class ValidPerfectSquare {
      public static boolean perfectSquare(int num) {
            if (num == 1) {
                  return true;
            }
            long i = 1;
            while (i * i <= num) {
                  if (i * i == num) {
                        return true;
                  }
                  i++;
            }
            return false;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(perfectSquare(num));
      }
}