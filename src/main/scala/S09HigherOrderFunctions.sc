val numbers = Seq(2, 7, 4, 5)
// Simple function
val doubleNum = (x: Int) => x * 2
// map -> Higher-order function
val dNumbers1 = numbers.map(doubleNum) // List(4, 14, 8, 10)
val newSalaries2 = numbers.map(x => x * 2) // List(4, 14, 8, 10)
val newSalaries3 = numbers.map(_ * 2) // List(4, 14, 8, 10)

implicit class SeqExtends(sq: Seq[Int]) {
  def MyMap(f: Int => Int): Seq[Int] = for (s <- sq) yield f(s)
}
implicit class SeqExtends1(sq: Seq[Int]) {
  def length(f: Int => Int): Int = sq.size
}
// MyMap -> Higher-order function
val myNumbers = numbers.MyMap(num => num * 2)
numbers.length((x: Int) => 1+x)
// List(4, 14, 8, 10)

// Higher order functions return a function as a result
// urlBuilder -> Higher-order function
def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) =>
    s"$schema$domainName/$endpoint?$query"
}
val domainName = "www.example.com"
// function from urlBuilder
def getURL: (String, String) => String =
  urlBuilder(ssl=true, domainName)
val url = getURL("users", "id=1") // https://www.example.com/users?id=1
