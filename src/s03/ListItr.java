package s03;

public class ListItr {
  List list;
  ListNode pred, succ;

  // ----------------------------------------------------------
  public ListItr(List anyList) {
    list = anyList;
    goToFirst();
  }

  // ----------------------------------------------------------
  public void insertAfter(int e) {
    // TODO - A COMPLETER
  }

  // ----------------------------------------------------------
  public void removeAfter() {
    // TODO - A COMPLETER
  }

  // ----------------------------------------------------------
  public int consultAfter() {
    return succ.elt;
  }

  public void goToNext() {
    if (this.isLast())
      System.out.println("Pas possible il s'agit du dernier élément");
    else
    pred = succ;
    succ = succ.next;
  }

  public void goToPrev() {
    if (this.isFirst())
      System.out.println("Pas possible il s'agit du premier élément");
    else
    succ = pred;
    pred = pred.prev;
  }

  public void goToFirst() {
    succ = list.first;
    pred = null;
  }

  public void goToLast() {
    pred = list.last;
    succ = null;
  }

  public boolean isFirst() {
    return pred == null;
  }

  public boolean isLast() {
    return succ == null;
  }
}

// When isFirst(), it is forbidden to call goToPrev()
// When isLast(), it is forbidden to call goToNext()
// When isLast(), it is forbidden to call consultAfter(), or removeAfter()
// For an empty list, isLast()==isFirst()==true
// For a fresh ListItr, isFirst()==true
// Using multiple iterators on the same list is allowed only
// if none of them modifies the list
