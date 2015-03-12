package s04;
import s03.List; 
import s03.ListItr; 

public class Bubble {
  //---------------------------------------------
  static void bubbleSortList(List l) {
    if (l.isEmpty()) return;
    ListItr li = new ListItr(l);
    boolean goOn=true;
    while(goOn) {
      // TODO - A COMPLETER...
    }
  }
  //---------------------------------------------
  //Swaps between left and right element if needed
  //Returns true if swap occurred
  static boolean bubbleSwapped(ListItr li) {
    if (li.isFirst() || li.isLast()) return false;
    // TODO - A COMPLETER...
    return true;
  }
  //---------------------------------------------
  public static void main(String[] args) {
    List l=new List();
    ListItr li = new ListItr(l);
    int [] t = {4,3,9,2,1,8,0};
    int [] r = {0,1,2,3,4,8,9};
    for(int i=0; i<t.length; i++) {
      li.insertAfter(t[i]); li.goToNext();
    }
    bubbleSortList(l);
    li=new ListItr(l);
    for (int i=0; i<r.length; i++) {
      if (li.isLast() || li.consultAfter() != r[i])  {
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