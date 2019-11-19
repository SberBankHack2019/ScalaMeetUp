// Generic classes take a type as a parameter
// within square brackets []
class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A): Unit = elements = x :: elements
  def top: A = elements.head
  def all: List[A] = elements
  def pop(): A = {
    val currentTop = top
    elements = elements.tail
    currentTop
  }
} //

// Stack with Int
val stackInt: Stack[Int] = new Stack[Int]
(stackInt.push(1), stackInt.push(2))
println(stackInt.all)    // List(2, 1)
println(stackInt.pop())  // prints 2
println(stackInt.pop())  // prints 1

// with custom Class
class Fruit
class Apple extends Fruit {override def toString: String = "Apple"}
class Banana extends Fruit {override def toString: String = "Banana"}

val stackFr: Stack[Fruit] = new Stack[Fruit]
val (apple, banana) = (new Apple, new Banana)
(stackFr.push(apple), stackFr.push(banana))
println(stackFr.all)    // List(Banana, Apple)
println(stackFr.pop())  // Banana
println(stackFr.pop())  // Apple
