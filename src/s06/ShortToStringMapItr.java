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
  private short[] id;
  // ----------------------------------------
 public ShortToStringMapItr (ShortToStringMap m) {
   this.m=m;
   this.id=m.getId();
  }
 // ----------------------------------------
  public boolean hasMoreKeys() {
    if (m.size()==pos)
      return false;
    return true; 
  }
  // ----------------------------------------
  // PRE-condition: hasMoreKeys()
  public short   nextKey() {
    if(this.hasMoreKeys())
      return this.id[pos++];
    else
    {
      pos=0;
      return this.id[pos];
    }
  }
  
}