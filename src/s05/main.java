package s05;

public class main {

  public static void main(String[] args) {
System.out.println(fact (35));
System.out.println(fibonacci(11));
System.out.println(power(55));
  }
  
  public static long fact(long i){
    if (i==1)
    return 1;
    return i * fact(--i);
  }

  public static long fibonacci(long n){
    if (n==0)
      return 0;
    if (n==1)
      return 1;
    return fibonacci(n-2)+fibonacci(n-1);
  }
  
  public static long power(long n){
    if (n==0)
      return 0;
    if (n==1)
        return n;
    return n*n;
    
  }
 
}
