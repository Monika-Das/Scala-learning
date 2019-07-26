package lecture.part1Basics

/**
  * created by Monika 26th Jul,2019
  */

object DefaultArg extends App{

  //mentioning dafult parameter of accumulator
  def tailRecursiveFact(n:Int, acc:Int =1):Int =
    if (n<=1) acc
    else tailRecursiveFact(n-1, n*acc)

  val fact10 = tailRecursiveFact(10)
  println(fact10)
  val fact11 = tailRecursiveFact(10,2) //if we want to change value of accumulator,we can pass it here
  println(fact11)
}
