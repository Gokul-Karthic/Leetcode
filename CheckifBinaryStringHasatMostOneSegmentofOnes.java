import java.util.Scanner;

public class CheckifBinaryStringHasatMostOneSegmentofOnes {
      public static boolean checkOnesSegment(String s) {
            return !s.contains("01");

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(checkOnesSegment(s));
      }

}
