import java.util.Scanner;

public class CheckIfTwoStringArraysareEquivalent {
      public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < word1.length; i++) {
                  s1 += word1[i];
            }
            for (int j = 0; j < word2.length; j++) {
                  s2 += word2[j];

            }
            if (s1.equals(s2)) {
                  return true;
            }
            return false;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] word1 = new String[n];
            for (int i = 0; i < n; i++) {
                  word1[i] = sc.next();
            }
            String[] word2 = new String[n];
            for (int i = 0; i < n; i++) {
                  word2[i] = sc.next();
            }
            System.out.println(arrayStringsAreEqual(word1, word2));

      }
}
