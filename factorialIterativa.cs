using System;
namespace contador
{
  class Program
  {
   static void Main(string[] args)
   {
     contador(5);
   }
   public static void contador(int a)
   {
     int b=1;
     for (int i =1; i<a+1; i++) {
       b=b*i;
     }
     Console.WriteLine(b);
   }
  }
}
