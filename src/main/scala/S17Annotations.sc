//Annotations associate meta-information
// with definitions for Scala Compiler
object DeprecationDemo extends App {
  @deprecated("deprecation message", "release 1.1")
  def hello = "hola"

  hello
}
// warning: there was one deprecation warning (since release 1.1)
DeprecationDemo.hello

import scala.annotation.tailrec

def factorial(x: Int): Int = {
  @tailrec
  def factorialHelper(x: Int, accumulator: Int): Int = {
    if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
  }
  factorialHelper(x, 1)
}

List(1, 2, 3, 4, 5).map(factorial)
// List(1, 2, 6, 24, 120)
