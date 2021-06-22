public class factorialCon{
  static int  factorial(int a, int b)
  {
    if (a==0) {
      return b;
    }else return factorial(a-1,a*b);
  }
  static int fact(int c)
  {
    return factorial(c,1);
  }
  public static void main(String[] args) {
    System.out.println(fact(5));
  }
}
