import java.util.Scanner;

public class NumberofStepstoReduceaNumbertoZero {
      public static int numberofsteps(int num) {
            int steps = 0;
            while (num > 0) {
                  if (num % 2 == 0) {
                        num = num / 2;
                        steps++;
                  } else {

                        num--;
                        steps++;
                  }
            }
            return steps;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(numberofsteps(num));
      }
}
