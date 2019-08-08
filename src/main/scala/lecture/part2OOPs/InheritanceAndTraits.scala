package lecture.part2OOPs

/**
  * created by Monika 8.8.2019
  */

object InheritanceAndTraits extends App {
  //single class inheritance
  class Animal{
    val creatureType = "wild"
    def eat = println("nomnom") //if private def eat, then eat is usable within Animal only, protected modifier allows
    //inheritance within subclass also
  }

  class Cat extends Animal
  val cat = new Cat
  //Subclass(Cat) can inherit only non-private methods of Superclass (Animal)
  cat.eat //call method eat of Animal as cat is object of Class cat which extends Animal - inherits all methods of Animal

  //constructors
  class Person(name:String, age:Int) {
    //defining aux constructor instead of passing(name,age) in person below:
    def this(name:String) = this(name,0) //we can pass now only name/age in below Person as constructor is defined
  }
  class Adult(name:String, age:Int, IDcard:String) extends Person(name,age) // pass name & age to create constructor
  //of Person first, then Adult

  //overriding
  class Dog(override val creatureType: String) extends Animal{
    //override val creatureType = "domestic"
    super.eat
    override def eat = println("crunchcrunch")
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //type substitution -- broad sense polymorphism - method call goes to most recent overridden method
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overriding(supplying diff implementation in diff methods) vs overloading(multiple methods with diff siganatures but same names in same class)
  //super

  //prevent override & extend by using final

}
