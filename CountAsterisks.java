public class CountAsterisks {
      public int countAsterisks(String s) {
            Boolean isCount = false;
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                  if (ch == '|' && isCount == false) {
                        isCount = true;
                  } else if (ch == '|' && isCount == true) {
                        isCount = false;
                  }
                  if (ch == '*' && isCount == false) {
                        ans++;
                  }
            }
            return ans;
      }
}
