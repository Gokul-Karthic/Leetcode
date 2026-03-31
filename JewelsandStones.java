
import java.util.Scanner;

public class JewelsandStones {
      public static int numJewelsInStones(String jewels, String stones) {
            int count = 0;
            for (int i = 0; i < stones.length(); i++) {
                  for (int j = 0; j < jewels.length(); j++) {
                        if (jewels.charAt(j) == stones.charAt(i)) {
                              count++;
                              break;
                        }
                  }
            }
            return count;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String j = sc.next();
            String s = sc.next();
            System.out.println(numJewelsInStones(j, s));

      }
}
