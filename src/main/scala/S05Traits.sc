trait BusinessMan {
  def sell(): Int = 1
}

trait Commander {
  def promote(): Int = 1
}

class Director extends BusinessMan with Commander
val Denis = new Director
Denis.sell() // res0: Int = 1
Denis.promote()


trait Iterator {
  def hasNext: Boolean
  def next(): Int
}

class IntIterator(to: Int) extends Iterator {
  private var now = 0
  override def hasNext: Boolean = now < to
  override def next(): Int = if (hasNext) {
    val temp = now
    now += 1
    temp
  } else 0
}

val it = new IntIterator(10)
it.next()
it.next()
it.next()
it.hasNext

import scala.collection.mutable.ListBuffer

trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

val dog = new Dog("Harry")
val cat = new Cat("Sally")

val animals = ListBuffer.empty[Pet]
animals.prepend(dog)
animals.prepend(cat)
// Prints Harry Sally
animals.foreach(pet => println(pet.name))
