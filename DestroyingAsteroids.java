import java.util.Arrays;

public class DestroyingAsteroids {
      public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            long curmass = mass;
            Arrays.sort(asteroids);
            for (int i = 0; i < asteroids.length; i++) {
                  if (curmass >= asteroids[i]) {
                        curmass += asteroids[i];
                  } else {
                        return false;
                  }
            }
            return true;
      }
}
