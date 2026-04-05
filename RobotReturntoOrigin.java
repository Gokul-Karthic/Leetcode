
import java.util.Scanner;

public class RobotReturntoOrigin {
      public static boolean judgeCircle(String moves) {
            int l = 0;
            int r = 0;
            int u = 0;
            int d = 0;
            for (int i = 0; i < moves.length(); i++) {
                  if (moves.charAt(i) == 'L') {
                        l++;
                  } else if (moves.charAt(i) == 'R') {
                        r++;
                  } else if (moves.charAt(i) == 'U') {
                        u++;
                  } else {
                        d++;
                  }
            }
            if (l == r && u == d) {

                  return true;
            } else {
                  return false;
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(judgeCircle(s));

      }

}
