package s04;

import s03.*;

public class Bubble {

  // ---------------------------------------------
  static void bubbleSortList(List l) {
    int k = l.size();
    if (l.isEmpty())
      return;
    ListItr li = new ListItr(l);
    boolean goOn = true;
    int i=0;
    boolean swapped=false;
    while (goOn) {
      if (li.isLast()) {
        li.goToFirst();
        goOn=swapped;
        swapped=false;
      }
      if(bubbleSwapped(li))
        swapped=true;
      li.goToNext();
    }
  }

  // ---------------------------------------------
  // Swaps between left and right element if needed
  // Returns true if swap occurred
  static boolean bubbleSwapped(ListItr li) {
    if (li.isFirst() || li.isLast())
      return false;
    int mem;
    if (li.pred.elt>li.succ.elt) {
       mem=li.consultAfter();
       li.removeAfter();
       li.goToPrev();
       li.insertAfter(mem);
       return true;
    }
    else
      return false;
  }

  // ---------------------------------------------
  public static void main(String[] args) {
    List l = new List();
    ListItr li = new ListItr(l);
    int[] t = { 4, 3, 9, 2, 1, 8, 0 };
    int[] r = { 0, 1, 2, 3, 4, 8, 9 };
    for (int i = 0; i < t.length; i++) {
      li.insertAfter(t[i]);
      li.goToNext();
    }
    bubbleSortList(l);
    li = new ListItr(l);
    for (int i = 0; i < r.length; i++) {
      if (li.isLast() || li.consultAfter() != r[i]) {
        System.out.println("Oups... something is wrong");
        System.exit(-1);
      }
      li.goToNext();
    }
    if (!li.isLast()) {
      System.out.println("Oups... too much elements");
      System.exit(-1);
    }
    System.out.println("Test passed successfully");
  }
}