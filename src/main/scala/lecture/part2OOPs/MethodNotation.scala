package lecture.part2OOPs

/**
  * created by Monika 31st july,2019
  */
object MethodNotation extends App{

  class Person(val name: String, favouriteMovie: String){
    def likes(movie:String):Boolean = movie == favouriteMovie
    def hangsOutWith(person: Person):String = s"${this.name} is hanging out with ${person.name}"

    //apply method
    def apply():String = s"Hi, my name is $name and I like $favouriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  //infix notation type - only when method has 1 parameter - operator notation
  println(mary likes "Inception") //equivalent to above - syntactic sugar - infix,prefix,postfix

  val tom = new Person("Tom", "Fight Club")

  //apply
  println(mary.apply)
  println(mary.apply())
  println(mary()) //same as above

}
