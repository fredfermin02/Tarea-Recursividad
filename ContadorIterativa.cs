using System;
namespace contador
{
  class program
  {
   static void Main(string[] args)
   {
     contador(5);
   }
   public static void contador(int a)
   {
     int b=0;
     for (int i =0; i<a+1; i++) {
       b=b+i;
     }
     Console.WriteLine(b);
   }
  }
}
