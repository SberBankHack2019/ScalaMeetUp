def listOfDuplicates[A](x: A, length: Int): List[A] = {
  if (length < 1) Nil
  else x :: listOfDuplicates(x, length - 1)
}
// List(3, 3, 3, 3)
println(listOfDuplicates[Int](3, 4))
// List(La, La, La)
println(listOfDuplicates("La", 3))

// Methods in Scala can be parameterized by type
// as well as value
def convector[A, B](a: A)(implicit f: A => B): B = {
    f(a)
}
implicit def ListIntToInt(list: List[Int]): Int = {
    list.size
}

val li = List(1, 2, 3)
val b: Int = convector(li)  // 3
val b2 = convector[List[Int], Int](li)(ListIntToInt)  // 3
