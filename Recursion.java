/*
Jemma Tiongson
Section #16031
App: Recursion.java
Purpose: Demonstrate ability to program and use recursion methods.
-------------------------------------------------------------------------

Terminal:
   Compile: javac Recursion.java
   Run: java Recursion
_________________________________________________________________________
*/
class Recursion{
   //Factorial
   public static int factorial(int n){
      if(n <= 1) {
         return 1;
      }
      return n * factorial(n-1);
   }
   //Fibonacci
   public static int fib(int n){
      if(n <= 1){
         return 1;
      }
      return fib(n-1) + fib(n-2);
   }
   //Euclidean
   public static int gcd(int x, int y){
      if(y == 0){
         return x;
      }
      return gcd(y, (x%y));
   }
   public static double natural(int n){
      return Math.log((double)factorial(n));
   }
   
   public static void main(String [] args){
      //factorial tests
      
      int val = factorial(6);
      System.out.println("6! = " +val);
      int val2 = factorial(3);
      System.out.println("3! = " +val2);
      int val3 = factorial(10);
      System.out.println("10! = " +val3);
      System.out.println("_____________________");
      int val4 = fib(6);
      System.out.println("fib(6) = " +val4);
      int val5 = fib(3);
      System.out.println("fib(3) = " +val5);
      int val6 = fib(10);
      System.out.println("fib(10) = " +val6);
      System.out.println("_____________________");
      int val7 = gcd(6, 8);
      System.out.println("GCD of 6 and 8 is " +val7);
      int val8 = gcd(3, 14);
      System.out.println("GCD of 3 and 14 is " +val8);
      int val9 = gcd(10, 23);
      System.out.println("GCD of 10 and 23 is " +val9);
      System.out.println("_____________________");
      double val10 = natural(3);
      System.out.println("Natural log of 3 is: " +val10);
      double val11 = natural(1);
      System.out.println("Natural log of 1 is: " +val11);
      double val12 = natural(2);
      System.out.println("Natural log of 2 is: " +val12);
      System.out.println("_____________________");
   }
}