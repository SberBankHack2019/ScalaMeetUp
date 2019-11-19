class NDirector  //minimal class
val Denis = new NDirector

class Point(x: Int = 0, y: Int = 0) {
  override def toString: String = s"($x, $y)"
}
val point = new Point(1) //point: Point = (1, 0)

class VPerson(var firstName: String, var lastName: String)
val p = new VPerson("Martin", "Odersky")
println(p.firstName + " " + p.lastName)

p.firstName = "Vladimir"
p.lastName = "Putin"
println(p.firstName + " " + p.lastName)

class ImPerson(val firstName: String, val lastName: String)
val imp = new ImPerson("Martin", "Odersky")
println(imp.firstName + " " + imp.lastName)
// imp.firstName = "Vladimir"
// imp.lastName = "Putin"
println(imp.firstName + " " + imp.lastName)

case class CPerson(firstName: String, lastName: String)
val cp = CPerson("Martin", "Odersky")
println(cp.firstName + " " + cp.lastName)
// cp.firstName = "Vladimir"
// cp.lastName = "Putin"

val cp2 = cp.copy(firstName = "Vladimir", lastName = "Putin")
println(cp2.firstName + " " + cp2.lastName)

