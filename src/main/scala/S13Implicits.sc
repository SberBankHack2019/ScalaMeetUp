trait Monoid[A] {
  def combine(x: A, y: A): A
  def unit: A
}

object ImplicitTest {
  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def combine(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }
  implicit val strMonoid: Monoid[String] = new Monoid[String] {
    def combine(x: String, y: String): String = x concat y
    def unit: String = ""
  }
  // Implicit parameters
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.combine(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))       // uses intMonoid implicitly
    println(sum(List("a", "b", "c"))) // uses strMonoid implicitly
  }
} //

ImplicitTest.main(Array.empty)
// 6
// abc

import scala.language.implicitConversions

// Implicit conversion from type S to type T
implicit def convertListToInt[A](list: List[A]): Int = list.size

val list = List(1, 2, 3)
println(list) // List(1, 2, 3)

val s: Int = list
println(s) // 3

println(1 + list) // 4
println(list + list + 1) // 4

implicit class ReachInt(num: Int) {
  def fib: Int = num match {
    case 0 | 1 => 1
    case i => (i - 1).fib + (i - 2).fib
  }
}

List(1, 2, 3, 4, 5, 6).foreach(num => println(num.fib))
// 1 2 3 5 8 13


