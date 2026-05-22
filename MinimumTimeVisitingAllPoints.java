public class MinimumTimeVisitingAllPoints {
      public static int minTimeToVisitAllPoints(int[][] points) {
            int ans = 0;
            for (int i = 0; i < points.length - 1; i++) {
                  int curX = points[i][0];
                  int curY = points[i][1];
                  int tarX = points[i + 1][0];
                  int tarY = points[i + 1][1];
                  ans += Math.max(Math.abs(tarX - curX), Math.abs(tarY - curY));
            }

            return ans;
      }
}
