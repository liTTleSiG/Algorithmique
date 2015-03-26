package s06;

import java.util.Random;

public class ShortToStringMap {
  private int                 size;
  private short[]             id      = new short[50];
  private String[]            content = new String[50];
  private ShortToStringMapItr iterateur;

  // ------------------------------
  // Private methods
  // ------------------------------
  // ------------------------------
  // Private methods
  // ------------------------------
  private short locateKey(short i) {
    short j = 0;
    while (j < size) {
      if (id[j] == i)
        return j;
      j++;
    }
    return -1;
  }

  private void arrayIsFull() {
    if (size == id.length) {
      short[] newId = new short[2 * id.length];
      String[] newContent = new String[2 * content.length];
      for (int i = 0; i < id.length; i++) {
        newId[i] = id[i];
        newContent[i] = content[i];
      }
      id = newId;
      content = newContent;
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
    arrayIsFull();
    if (this.containsKey(key))                  // update la valeur si elle existe déjà
      content[this.locateKey(key)] = img;
    else {
      id[size] = key;
      content[size] = img;
      size++;
    }
  }

  // ------------------------------------------------------------
  // returns null if !containsKey(key)
  public String get(short key) {
    if (!containsKey(key))
      return null;
    else
      return content[this.locateKey(key)];

  }

  // ------------------------------------------------------------
  public void remove(short e) {
    if (this.containsKey(e)) {
      short pos = this.locateKey(e);
      id[pos] = id[size - 1];
      content[pos] = content[size - 1];
      size--;
    }
  }

  // ------------------------------------------------------------
  public boolean containsKey(short k) {
    if (locateKey(k) >= 0)
      return true;
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
    for (int i = 0; i < m.size; i++) {
      this.put(m.id[i], m.content[i]);
    }
  }

  // ------------------------------------------------------------
  // a.intersection(b) : "a becomes a intersection b"
  // images are those in b
  public void intersection(ShortToStringMap s) {
    ShortToStringMap inter = new ShortToStringMap();
    for (int i = 0; i < this.size; i++) {
      int pos = s.locateKey(id[i]);
      if (pos >= 0) {
        inter.put(id[i], s.content[pos]);
      }
    }
    id = inter.id;
    content = inter.content;
    size = inter.size;
  }

  // ------------------------------------------------------------
  // a.toString() returns all elements in
  // a string like: {3:"abc",9:"xy",-5:"jk"}
  public String toString() {
    String tab = "{";
    int i = 0;
    while (i < size) {
      tab += id[i] + ":\"" + content[i] + "\",";
      i++;
    }
    return tab + "}";
  }

  short[] getId() {
    return id;
  }
}
