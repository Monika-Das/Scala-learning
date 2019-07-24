package lecture.part1Basics

/**
  * created by Monika 23 July,2019
  */

object ValuesVariablesTypes extends App{
  val x:Int = 10
  println(x)
  //VALS ARE IMMUTABLE & TYPES ARE OPTIONAL(NO NEED TO SPECIFY INT)
  //COMPILER can infer types

  //values
  val aString:String = "Hello"
  println(aString)

  //types
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613 //(4 bytes)
  val aLong: Long = 5273985273895237L //(8 bytes)
  val aFloat: Float = 2.0f
  val aDouble:Double = 3.14

  //variables
  var aVariable:Int = 5
  aVariable = 6 //side-effects -- displaying/printing to console

  println(aBoolean)

}
