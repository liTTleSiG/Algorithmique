package s06;

public class ShortToStringMap {
  private int                 size;
  private short[]                     id      = new short[50];
  private String[]                    content = new String[50];
  private ShortToStringMapItr iterateur;

<<<<<<< HEAD
  //------------------------------
  //  Private methods
  //------------------------------
  private int locateKey(int i)
  {
    int j=0;
    while(j<size-1)
    {
      if (id[j]==i)
=======
  // ------------------------------
  // Private methods
  // ------------------------------
  private int locateKey(int i) {
    int j = 0;
    while (j < size - 1) {
      if (id[j] == i)
>>>>>>> origin/master
        return j;
      j++;
    }
    return -1;
  }
<<<<<<< HEAD
  
  private void arrayIsFull(){
    short[] newId= new short[2*id.length];
    String[] newContent= new String[2*content.length];
    for (int i=0;i<id.length;i++)
    {
      newId[i]=id[i];
      newContent[i]=content[i];
=======

  private void arrayIsFull() {
    short[] newId = new short[2 * id.length];
    String[] newContent = new String[2 * content.length];
    for (int i = 0; i < id.length; i++) {
      newId[i] = id[i];
      newContent[i] = content[i];
>>>>>>> origin/master
    }
  }
  // Could be useful, for instance :
  // - one method to detect and handle the "array is full" situation
  // - one method to locate a key in the array
  // (to be called from containsKey(), put(), and remove())

  // ------------------------------
  // Public methods
  // ------------------------------
  // ------------------------------------------------------------
  public ShortToStringMap() {
    iterateur = new ShortToStringMapItr(this);
  }

  // ------------------------------------------------------------
  // adds an entry in the map, or updates the image
  public void put(short key, String img) {
    if (this.containsKey(key))                  //update la valeur si elle existe déjà
      content[this.locateKey(key)] = img;
    if (!this.iterateur.hasMoreKeys())          //si notre ensemble est plein on appelle arrayIsFull()
      this.arrayIsFull();
    id[size + 1] = key;
    content[size + 1] = img;
  }

  // ------------------------------------------------------------
  // returns null if !containsKey(key)
  public String get(short key) {
    if (!containsKey(key))
      return null;
    else
      return content[this.locateKey(key)]; // a completer

  }

  // ------------------------------------------------------------
  public void remove(short e) {
    int toRemplace=locateKey(e);
  }

  // ------------------------------------------------------------
  public boolean containsKey(short k) {
<<<<<<< HEAD
    if (locateKey(k)>=0)
      return true;
=======
    for (short i = 0; i < size; i++) {
      if (id[i] == k)
        return true;
    }
>>>>>>> origin/master
    return false;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return size;
  }

  // ------------------------------------------------------------
  // a.union(b) : a becomes "a union b"
  // images are those in b whenever possible
  public void union(ShortToStringMap m) {
    // TODO - A COMPLETER...
  }

  // ------------------------------------------------------------
  // a.intersection(b) : "a becomes a intersection b"
  // images are those in b
  public void intersection(ShortToStringMap s) {
    // TODO - A COMPLETER...
  }

  // ------------------------------------------------------------
  // a.toString() returns all elements in
  // a string like: {3:"abc",9:"xy",-5:"jk"}
  public String toString() {
    return null;
  }
}
