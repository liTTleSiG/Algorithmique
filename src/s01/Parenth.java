package s01;

public class Parenth {
  // -------------------------------------
  // Usage: java Parenth 'aa(({adf}))' don't forget the ' !
  // -------------------------------------
  public static void main(String[] args) {
    if (args.length != 0) {
      String s = args[0];
      System.out.println(s + " : " + isBalanced(s));
    }

    String[] t = { "((o{()oo})o)",
        "oo((((((((((((((((((((o))))))))))))))))))))o{}", "oo())(()",
        "oo()((())()", "oo()((()})", ")()" };
    boolean[] answer = { true, true, false, false, false, false };
    boolean ok = true;
    for (int i = 0; i < t.length; i++) {
      ok = ok & (isBalanced(t[i]) == answer[i]);
      System.out.print(t[i] + " : " + isBalanced(t[i]));
      System.out.println(" (should be " + answer[i] + ")");
    }
    if (ok)
      System.out.println("\nTest passed successfully");
    else
      System.out.println("\nOups... There's a bug !");
  }

  // -------------------------------------
  public static boolean isBalanced(String l) {
    boolean result = true;
    char c;
    CharStack s = new CharStack(l.length());
    for (int i = 0; i < l.length(); i++) {
      c = l.charAt(i);

      if (isOpeningParenth(c)) {
        s.push(c);
        result = true;
      }

      if (isClosingParenth(c)) {
        boolean match = false;
        if (isMatchingParenth(s.top(), c)) {
          match=true;
          s.pop();
        }
/*
        for (int j = s.getTopIndex(), k = 0; j >= 0; j--) {
          k++;
          if (isMatchingParenth(s.pop(), c)) {
            match = true;
            j = -1;
            for (; k < 0; k--)
              s.pop();
          }
        }*/
        result = match;
        if (result == false) {
          return result;
        }
      }

    }
    if (!(s.isEmpty())) {
      result = false;
    }
    return result; // TODO - A ADAPTER !
  }

  // -------------------------------------
  private static boolean isOpeningParenth(char c) {
    return (c == '(') || (c == '{');
  }

  private static boolean isClosingParenth(char c) {
    return (c == ')') || (c == '}');
  }

  private static boolean isMatchingParenth(char c1, char c2) {
    return ((c1 == '(') && (c2 == ')')) || ((c1 == '{') && (c2 == '}'));
  }
}