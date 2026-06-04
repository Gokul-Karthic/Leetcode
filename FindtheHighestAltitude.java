public class FindtheHighestAltitude {
      public int largestAltitude(int[] gain) {
            int cur = 0;
            int max = 0;
            for (int i : gain) {
                  cur += i;
                  if (cur > max) {
                        max = cur;
                  }
            }
            return max;
      }
}
