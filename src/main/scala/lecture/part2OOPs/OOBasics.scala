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

  ///////////////////exercises execution/////////////////////////
  val author = new Writer("Charles", "Dickens", 1912)
  val novel = new Novel("GreatExpectations",1961,author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.increment.print
  counter.increment.increment.increment.print
  counter.increment(10).print

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

/////////////////////////////exercises///////////////////////////////////////////////
/**
  * exercise1: writer & novel
  */
class Writer(firstname: String, lastname: String, val year: Int) {
  def fullname:String = firstname + " " + lastname
}
class Novel(name:String, year:Int, author:Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear:Int):Novel = new Novel(name, newYear, author)
}

/**
  * exercise2: counter implementation
  */
class Counter1(n: Int) {
  def count = n //method that uses parameter defined in class is called getter, instead just use the count as parameter
}
//counter used as parameter
class Counter(val count:Int = 0) {

  def increment = {
    println("Incrementing") //side-effect
    new Counter(count + 1)
  }//immutability, returning new count

  def decrement = {
    println("Decrementing") //side-effect
    new Counter(count-1)
  }

  //overload these to receive an amount
  def increment1(n:Int) = new Counter(count+n)

  //overloading method increment with n
  def decrement1(n:Int) = new Counter(count-n)

  def increment(n:Int) :Counter = {
    if(n<=0) this
    else increment.increment(n+1)
  }

  def decrement(n:Int):Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)

    def print = println((count))
  }

}
