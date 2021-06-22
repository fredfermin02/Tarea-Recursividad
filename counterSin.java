public class counterSin{
  static int contador(int a){
    if (a>0) {
      a=a+contador(a-1);
    }
    return a;
  }
  public static void main(String[] args) {
    System.out.println(contador(5));
  }
}
