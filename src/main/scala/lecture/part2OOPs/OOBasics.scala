package lecture.part2OOPs

/**
  * created by Monika 30th july,2019
  */
object OOBasics extends App {
  val person = new Person("John", 28) //name & age is to be passed
  println(person.age) //for declaring with val, we can use person.age
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

// Constructor - every single Person must be constructed by passing name & age
class Person(name: String, val age:Int = 0) {
  //body
  val x = 2 //this is field, so can be called as person.x from object
  println(1+2) //this will be printed as everytime whole class is called from object - it is a side-effect

  //method (function inside class is called method
  def greet(name: String):Unit = println(s"${this.name} says: Hi, $name") //this refers to name param of class passed as John in object

  //overloading - different signatures - type of params
  def greet(): Unit = println(s"Hi this is $name") //this is not required, it calls name of class - John

  //multiple constructors - aux/secondary constructor -- instead just define age as 0 in param of main constructor
  def this(name: String) = this(name, 0) //this(name,0) refers to main constructor, restricted just to define without 0
  def this() = this("John") //restricted to this use only


}

//class parameters are NOT FIELDS
//person.age in println statement will not work -- we have to define val age:Int in class as parameter for person.age
//convert parameter to field -- use val


