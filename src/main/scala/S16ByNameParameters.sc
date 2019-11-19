import scala.annotation.tailrec

// By-name parameters are only evaluated when used
def calculate(input: => Int): Int = input * 37

// By-name parameters have the advantage that they
// are not evaluated if they aren’t used in the function body
@tailrec
def whileLoop(condition: => Boolean)
             (body: => Unit): Unit =
  if (condition) {
    body
    whileLoop(condition)(body)
  }

var i = 2

whileLoop (i > 0) {
  println(i)
  i -= 1
}  // prints 2 1

