import java.util.Scanner;

public class NumberofLaserBeamsinaBank {
      public static int numberOfBeams(String[] bank) {
            int prev = 0;
            int ans = 0;
            for (String s : bank) {
                  int count = 0;
                  for (char ch : s.toCharArray()) {
                        if (ch == '1') {
                              count++;
                        }
                  }
                  if (count > 0) {
                        ans += prev * count;
                        prev = count;
                  }
            }
            return ans;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] bank = new String[n];
            for (int i = 0; i < n; i++) {
                  bank[i] = sc.next();
            }
            System.out.println(numberOfBeams(bank));
      }

}
