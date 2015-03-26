package s06;
public class ShortToStringMapItr {
  private short pos=0;
  public short getPos() {
    return pos;
  }
  public void setPos(short pos) {
    this.pos = pos;
  }
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
      return m.get(pos++);
    else
    {
      pos=0;
      return m.id[pos];
    }
  }
  
}