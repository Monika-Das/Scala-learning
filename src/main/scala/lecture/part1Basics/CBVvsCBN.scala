package lecture.part1Basics

object CBVvsCBN extends App {

  def CallByValue(x: Long): Unit = {
    println("by value: " +x)
    println("by Value: " +x)
  }

  def CallbyName(x: => Long): Unit = {
    println("By Value: " +x)
    println("By Value: " +x)
  }

  CallByValue(System.nanoTime()) // same result as value is referred to
  CallbyName(System.nanoTime()) //different result as by name only

  def infinite(): Int = 1 + infinite()
  def printFirst(x:Int, y: => Int) = println(x)

  //printFirst(infinite(),35) //will result in jvm crashing as first infinite is called
  printFirst(35,infinite()) //prints 35, then infinite() so doesnt crash as printFirst only considers x here


}
