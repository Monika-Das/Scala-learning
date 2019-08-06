package lecture.part2OOPs

/**
  * created by Monika 02.08.2019
  */

object Objects extends App { //static level/class level functionality
  //SCALA DOESNOT HAVE STATIC - DOESNOT HAVE CLASS LEVEL FUNCTIONALITY ("Statics") = object
  //equivalent to public static final - in scala for class level definition we use object
  object Person{ //objects are not receiving parameters, its has "val", "var", methods
    val N_EYES = 2
    def canFly: Boolean = false

  //apply method is called a factory method
  def apply(mother:Person, father:Person):Person = new Person("Bobbie")

  }

  class Person(val name:String) {
    //class & object have same name, instance - level functionality
  }
  /**
    * object Person & class Person are Companions of each other -- COMPANION OBJECTS
    * so we only have to call any instance from either object or class -- its truly OBJECT-ORIENTED
    * more than any other language
     */


  println(Person.N_EYES)
  println(Person.canFly)

  //Scala OBJECT = SINGLETON INSTANCE = its own type(Person) and its only instance
  val mary = Person //person is the only instance
  val john = Person //person is the only instance
  println(mary == john) //true as the instance person is same - only 1 so singleton, both point to same object

  val person1 = new Person("Mary")
  val person2 = new Person("John")
  println(person1 == person2) //false as these are new insatnces and not equal

  val bobbie = Person.apply(person1,person2)
 //same as above val bobbie = Person(person1,person2)

  //SCALA APPLICATION have to be Scala object with below main definition:
  //def main(args: Array[String]):Unit ----- as scala objects are turned to jvm objects so public static void main needed




}
