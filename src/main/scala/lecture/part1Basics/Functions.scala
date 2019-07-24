package lecture.part1Basics

/**
  * created by Monika 23 July,2019
  */
object Functions extends App {

  def aFunction(aString:String, n:Int) = {
    aString + " " + n
  }
  println(aFunction("Hello",3))

  def aRepeatedFunction(aString: String, n: Int):String =  {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Monika", 6))
  //WHEN YOU NEED LOOP, USE RECURSION
  //USE RETURN TYPE FOR RECURSIVE FUNCTION ALWAYS

  def aFunctionWithSideEffect(aString: String) = println("Hi")

  //exercises

  //1. Greeting function
  def Greeting(name: String, age: Int):String = {
    "Hi my name is " + name + " and age is " + age + " years old"
  }
  println(Greeting("David",14))

  //2. Factorial function
  def Factorial(n:Int): Int = {
    if (n<= 0) 1
    else n*Factorial(n-1)
  }
  println(Factorial(4))

  //3. Fibonacci function
  def Fibonacci(n:Int): Int = {
    if (n<= 2) 1
    else Fibonacci(n-1)+Fibonacci(n-2)
  }
  println(Fibonacci(8))

  //4. Test if function is prime
//  def isPrime(n:Int):Boolean = {
//    if (n%2 == 0) false
//    else true
//  }
//  if isPrime() true println("Prime")
}
