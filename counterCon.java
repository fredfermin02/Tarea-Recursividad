public class counterCon{
  static int contador(int a, int b)
  {
    if (a==1) {
      return b;
    }else return contador(a-1,a+b);
  }
  static int cont(int c)
  {
    return contador(c,1);
  }
  public static void main(String[] args) {
    System.out.println(cont(5));
  }
}
