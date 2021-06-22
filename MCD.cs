using System;
namespace MCD
{
  class program
  {
    public static void Main(string[] args)
    {
        MCD(35,10);
    }
    public static void MCD(int a , int b)
    {
      int restante = 0;
      do{
        restante =b;
        b = a%b;
        a = restante;
      }while(b!=0);
      Console.WriteLine(restante);
    }
  }
}
