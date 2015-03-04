package s01;

public class CharStack {
  private int              topIndex;
  private char[]           buffer;
  // -------------------------------------
  private static final int DEFAULT_SIZE = 10;

  // -------------------------------------
  public CharStack() {
    this(DEFAULT_SIZE);
  }

  // -------------------------------------
  public CharStack(int estimatedSize) {
    buffer = new char[estimatedSize];
    topIndex = -1;
  }

  // -------------------------------------
  public boolean isEmpty() {
    if (topIndex < 0)
      return true;
    else
      return false;
  }

  // -------------------------------------
  public char top() {
    if (this.isEmpty())
      return '\0';
    else
      return buffer[topIndex];
  }

  // -------------------------------------
  public char pop() {
    char retourner;
    /*
     * if (this.isEmpty()) throw new Exception("Cannot pop, Stack is empty");
     * else {
     */
    retourner = buffer[topIndex];
    topIndex--;
    return retourner;

  }

  // -------------------------------------
  public void push(char x) {
    topIndex++;
    if (topIndex >= buffer.length)
      this.doubleStack(x);

    else {
      buffer[topIndex] = x;
    }
  }

  // -------------------------------------

  private void doubleStack(char newChar) {
    CharStack tempStack = new CharStack(buffer.length);
    CharStack newStack = new CharStack(buffer.length * 2);
    for (int i = 0; i < this.buffer.length; i++) {
      tempStack.push(this.pop());
    }
    for (int i = 0; i < tempStack.buffer.length; i++) {
      newStack.push(tempStack.pop());
    }
    this.buffer = newStack.buffer;
    this.buffer[topIndex] = newChar;
  }

  int getTopIndex() {
    return this.topIndex;
  }

}
