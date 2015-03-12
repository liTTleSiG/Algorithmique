package s04;

public class Sorting {
  public static void main(String[] args) {
    int[] t = { 4, 3, 2, 6, 8, 7 };
    int[] u = { 2, 3, 4, 6, 7, 8 };
    shellSort(t);
    for (int i = 0; i < t.length; i++)
      if (t[i] != u[i]) {
        System.out.println("Something is wrong...");
        return;
      }
    int[] v = { 5 };
    shellSort(v);
    int[] w = {};
    shellSort(w);
    System.out.println("\nMini-test passed successfully...");
  }

  // ------------------------------------------------------------
  public static void selectionSort(int[] a) {
    int i, j, v, min;
    for (i = 0; i < a.length; i++) {
      for (j = i, min = a[j], v = j; j < a.length; j++) {
        if (min > a[j]) {
          min = a[j];
          v = j;
        }
      }
      a[v] = a[i];
      a[i] = min;
    }
  }

  // ------------------------------------------------------------
  public static void shellSort(int[] a) {
    int i, j, l, v, min;
    int k = 4;
    while (k >= 1) {
      for (l = 0; l < k; l++) {
      /*  for (i = l; i < a.length; i += k) {
          for (j = i, min = a[j], v = j; j < a.length; j += k) {
            if (min > a[j]) {
              min = a[j];
              v = j;
            }
          }
          a[v] = a[i];
          a[i] = min;
        }*/
        for (i = l; i < a.length; i+=k) {
          v = a[i];          
          j = i;
          while (j > 0 && a[j - 1] > v) {
            a[j] = a[j - 1];   
            j--;
          }
          a[j] = v;          
        }
      }
      k = k / 2;
    }
  }

  // ------------------------------------------------------------
  public static void insertionSort(int[] a) {
    int i, j, v;

    for (i = 1; i < a.length; i++) {
      v = a[i];          // v is the element to insert
      j = i;
      while (j > 0 && a[j - 1] > v) {
        a[j] = a[j - 1];   // move to the right
        j--;
      }
      a[j] = v;          // insert the element
    }
  }
  // ------------------------------------------------------------
}
