public class factorialSin{
  static int factorial(int a){
    if (a>1) {
      a=a*factorial(a-1);
    }
    return a;
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
