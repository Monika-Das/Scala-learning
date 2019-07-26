package lecture.part1Basics

/**
  * created by Monika 26th jul,2019
  */

object StringOps extends App{

  val str:String = "Hello, I am learning Scala"
  println(str.charAt(2))
  println(str.substring(3,10))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println((str.toUpperCase()))
  println(str.length)

  val aNumString = "45"
  println(aNumString.toInt)
  println('a' +: aNumString :+ 'z')
  println(aNumString.reverse)

//Scala specific string interpolation
  val name = "David"
  val age = 12
  val greeting = s"Hello I am $name and my age is $age"
  println(greeting)

//f-interpolation -- 2.2f means after decimal 2 places if precision
}
