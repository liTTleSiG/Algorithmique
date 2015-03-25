package s06;
public class ShortToStringMapItr {
  private int pos=0;
  private ShortToStringMap m;
  // ----------------------------------------
 public ShortToStringMapItr (ShortToStringMap m) {
   this.m=m;
  }
 // ----------------------------------------
  public boolean hasMoreKeys() {
    if (m.size()-1==pos)
      return false;
    return true; 
  }
  // ----------------------------------------
  // PRE-condition: hasMoreKeys()
  public short   nextKey() {
    if(this.hasMoreKeys())
      return m.id[++pos];
    else
    {
      pos=0;
      return m.id[pos];
    }
  }
}