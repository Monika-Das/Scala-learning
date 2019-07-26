package lecture.part1Basics

/**
  * created by Monika 24th jul,2019
  */

object Recursion extends App {

  //this is not a tail recursive function, adding annotation will throw error
  def factorial(n:Int): Int = {
    if (n<=1) 1
    else {
      println("Computing factorial of number " + n + "but first need factorial of " + (n-1))
      val result = n*factorial(n-1)
      println("Computed factorial of number " + n)

      result
    }
  }

  //println(factorial(10))
  //println(factorial(5000)) //will give stackoverflow error.Avoid this technique

  //another better way to implement
  def anotherFactorial(n:Int):BigInt = {
    //auxiliary function factHelper
    @scala.annotation.tailrec //annotation tell compiler that this function is tail recursive
    def factHelper(x:Int, accumulator:BigInt):BigInt =
      if(n<=1) accumulator
      else factHelper(x-1, x*accumulator)

     factHelper(n,1)

  }
  //println(anotherFactorial(10))
  println(anotherFactorial(50)) //will work now
  /*
    * whats happening here:
    * anotherFactorial(10) = factHelper(10,1)
    * = factHelper(9,10*1)
    * = factHelper(8,9*10*1)
    * = factHelper(7,8*9*10*1)
    * = factHelper(6,7*8*9*10*1)
    * ...
    *= factHelper(2,3*4*5*6*7*8*9*10*1)
    *= factHelper(1,2*3*4*5*6*7*8*9*10*1)
    *=  2*3*4*5*6*7*8*9*10*1 as result
    * This is called tail recursion, use recursive call as last expression
    */


//  def isPrime(n:Int):Boolean = {
//
//    def isPrimetailRec(t:Int, isStillPrime:Boolean): Boolean = {
//      if(!isStillPrime) false
//      else if (t <= 1) true
//      else isPrimetailRec(t-1, n % t != 0 && isStillPrime)
//
//    isPrimetailRec(n/2,true)
//
//    }
//
//    println(isPrime(2003))
//  }

}
