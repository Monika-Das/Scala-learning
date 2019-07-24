package lecture.part1Basics

/**
  * created by Monika 23rd Jul,2019
  */
object Expressions extends App {
  val x = 1 + 2 //expression
  println(x)
  println(2 + 3 * 4)

  //instruction(do this) vs expression (gives value)

  //if is expression in scala
  val aCondition = true
  val aconditionValue = if (aCondition) 5 else 3 //expression
  println(aconditionValue)
  println(if (aCondition) 5 else 3) //expression
  println(1 + 3) //expression

  //AVOID LOOPS IN SCALA, EVERYTHING IN SCALA IS AN EXPRESSION EXCEPT CLASS,OBJECT

  //val aWeirdvAlue = (aVariable = 3), Unit = (), void
  //side effects: while, re-assigning of var, println()

  //code values, y&z are available only within code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    println(if (z > 2) "hello" else "goodbye")
  }

  //Questions:
  //1. what is the difference between "hello world" and println("hello world")? --"hello world" is a value-string, println() is a unit expression
  //2.
  val someValue = {
    2 > 3
  }
  println(someValue) //its a boolean

  val anotherValue = {
    if (someValue) 239 else 986 //irrelevant here
    42
  }
  println((anotherValue))

}
