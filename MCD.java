public class MCD{
  static int mcd(int x,int y){
    if (y == 0){
      return x;
    }else{
      return mcd(y,x%y);
    }
  }
  public static void main(String[] args) {
    System.out.println(mcd(35,10));
  }
}
