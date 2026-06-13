public class WeightedWordMapping {
      public String mapWordWeights(String[] words, int[] weights) {
            StringBuilder ans = new StringBuilder(words.length);
            for (String s : words) {
                  int x = 0;
                  for (int i = 0; i < s.length(); i++) {
                        x += weights[s.charAt(i) - 'a'];
                  }
                  ans.append((char) ('z' - (x % 26)));
            }
            return ans.toString();
      }
}
