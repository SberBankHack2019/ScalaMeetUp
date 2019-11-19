// Tuple2 with 2 elements
val pie = ("Sugar" , 25)
(pie._1, pie._2)  // (Sugar,25)

// Tuples from methods
val (name: String, quantity: Int) = pie
println(name, quantity)  // (Sugar,25)
// Pattern Matching on Tuples
pie match {
  case (name, quantity) => println(name, quantity)
  case _ => println("Never happen") //
}

// for works with Tuples
val numPairs = List((1, 2), (3, 4), (5, 6))
for ( (a, b) <- numPairs ) {
  println(a * b)
}
