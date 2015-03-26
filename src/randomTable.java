import java.util.Arrays;
import java.util.Random;

public class randomTable {
  public static SetOfShorts set;

  public static void main(String[] args) {
  }

  public static short[] randomTable(short m, short n) {

    while (set.size() < m) {
      Random r = new Random();
      set.put(r.nextInt(n));
    }
    
    short[] result = set.getResult();
    Arrays.sort(result);
    return result;
  }
}
