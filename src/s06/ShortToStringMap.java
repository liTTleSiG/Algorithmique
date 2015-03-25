package s06;
public class ShortToStringMap {
  private int size;
  // TODO - A COMPLETER...
  //------------------------------
  //  Private methods
  //------------------------------
 
  // Could be useful, for instance :
  // - one method to detect and handle the "array is full" situation
  // - one method to locate a key in the array 
  //   (to be called from containsKey(), put(), and remove())

  //------------------------------
  //  Public methods
  //------------------------------
  // ------------------------------------------------------------
  public ShortToStringMap () {
    // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  // adds an entry in the map, or updates the image
  public void    put     (short key, String img) {
    // TODO - A COMPLETER...
  } 
  // ------------------------------------------------------------
  // returns null if !containsKey(key)
  public String  get     (short key) {
    return null; // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  public void    remove  (short e) { 
    // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  public boolean containsKey(short k) {
    return false; // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  public boolean isEmpty() { return size() == 0; }
  public int     size()    { return size;        }
  // ------------------------------------------------------------
  //a.union(b) :        a becomes "a union b"
  //  images are those in b whenever possible
  public void union(ShortToStringMap m) {
    // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  //a.intersection(b) : "a becomes a intersection b"
  //  images are those in b
  public void intersection(ShortToStringMap s) {
    // TODO - A COMPLETER...
  }
  // ------------------------------------------------------------
  //a.toString() returns all elements in 
  // a string like: {3:"abc",9:"xy",-5:"jk"}
  public String toString(){
    return null; 
  }
}
