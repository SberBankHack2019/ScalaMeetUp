abstract class Person {
  val message: String
}

class Admin extends Person {
  val message = "Please, get a ZNO"
}

trait Insulted extends Person {
  def loudMessage = s"$message !!!".toUpperCase()
    .replaceAll("PLEASE", "YOU MUST")
}

class CSPS extends Admin with Insulted
val Pavel = new CSPS
println(Pavel.message)  // Please, get a ZNO
println(Pavel.loudMessage)  // YOU MUST, GET A ZNO !!!

