import java.util.Scanner;

public class isomorphicString {
      public static boolean isIsomorphic(String s, String t) {
            int[] indexS = new int[200];
            int[] indexT = new int[200];
            int len = s.length();
            if (len != s.length()) {
                  return false;
            }
            for (int i = 0; i < len; i++) {
                  if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                        return false;
                  }
                  indexS[s.charAt(i)] = i + 1;
                  indexT[t.charAt(i)] = i + 1;
            }
            return true;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            System.out.println(isIsomorphic(s, t));

      }

}
