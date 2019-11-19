// For loop can be used to iterate over Lists
val (arr, arr2) = (Seq(1, 2, 3), List(4, 5))
for (i <- arr; j <- arr2)
  yield i + j // List(5, 6, 6, 7, 7, 8)

// For can be used for Expressions
val doubledArr = for (n <- arr) yield n * 2
val doubledArr2 = for (n <- arr if n > 1) yield n * 2

val doubledArr3 = for (n <- arr) yield {
  val start = 1
  start + n * 2
}

// Case Classes can be used with
case class User(name: String, age: Int)
val userBase = List(
  User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23))

val twentySomethings =
  for (user <- userBase if user.age >=20 && user.age < 30)
  yield user.name // List(Travis, Dennis)

twentySomethings.foreach(name => println(name))
// Travis Dennis
