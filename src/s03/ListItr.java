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
    ListNode aux = new ListNode(e, pred, succ);
    if (list.isEmpty()) {
      // List vide
      pred = null;
      succ = aux;
      list.first = aux;
      list.last = aux;
    } else if (this.isFirst()) {
      // Ajouter un élément au début
      succ.prev = aux;
      succ = aux;
      pred = null;
      list.first = aux;
    } else if (this.isLast()) {
      // Ajouter un élément à la fin
      pred.next = aux;
      pred = aux;
      succ = null;
      list.last = aux;
    } else {
      // Ajouter un élément au milieu
      succ.prev = aux;
      pred.next = aux;
      succ = aux;
    }
    // Incrémenter la taille de la liste
    list.size++;
  }

  public void removeAfter() {
    if (list.isEmpty()) {
      // Liste vide
      System.out.println("La liste est vide");
    } else if (this.isFirst()) {
      // Supprime le premier élément
      succ = null;
    } else if (this.isLast()) {
      // Supprime le premier élément
      System.out.println("Impossible, il s'agit du dernier élément");
    } else {
      succ = succ.next;
      pred.next = succ;
    }
  }

  public int consultAfter() {
    if (this.isLast()) {
      System.out.println("Pas possible il s'agit du dernier élément");
      return 0;
    } else
      return succ.elt;
  }

  public void goToNext() {
    if (this.isLast())
      System.out.println("Pas possible il s'agit du dernier élément");
    else {
      pred = succ;
      succ = succ.next;
    }
  }

  public void goToPrev() {
    if (this.isFirst())
      System.out.println("Pas possible il s'agit du premier élément");
    else {
      succ = pred;
      pred = pred.prev;
    }
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
//----------------------------------------------------------------------------
// For an empty list, isLast()==isFirst()==true
// For a fresh ListItr, isFirst()==true
// Using multiple iterators on the same list is allowed only
// if none of them modifies the list
