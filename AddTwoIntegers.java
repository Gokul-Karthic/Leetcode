
import java.util.Scanner;

public class AddTwoIntegers {
      public static int sum(int num1, int num2) {
            while (num2 != 0) {
                  int carry = num1 & num2;
                  num1 = num1 ^ num2;
                  num2 = carry << 1;
            }
            return num1;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(sum(num1, num2));
      }

}
