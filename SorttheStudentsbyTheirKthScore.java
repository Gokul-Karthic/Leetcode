import java.util.Arrays;

public class SorttheStudentsbyTheirKthScore {
      public static int[][] sortTheStudents(int[][] score, int k) {

            int n = score.length;

            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {

                        if (score[i][k] < score[j][k]) {

                              int[] temp = score[i];
                              score[i] = score[j];
                              score[j] = temp;
                        }
                  }
            }

            return score;
      }

      public static void main(String[] args) {

            int[][] score = {
                        { 10, 6, 9, 1 },
                        { 7, 5, 11, 2 },
                        { 4, 8, 3, 15 }
            };

            int k = 2;

            int[][] result = sortTheStudents(score, k);

            for (int[] row : result) {
                  System.out.println(Arrays.toString(row));
            }
      }
}
