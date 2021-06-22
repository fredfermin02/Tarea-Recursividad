import scala.annotation.tailrec

object program
{

  def MCD(a: Int,b: Int): Int =
  {
    @tailrec
    def MCD1(a: Int, b: Int): Int =
    {

      if (b == 0)
        a
    else
      MCD1(b,a%b)
    }
MCD1(a,b)

}
def main (args:Array[String])
  {
  println(MCD(35,10))
  }
}
