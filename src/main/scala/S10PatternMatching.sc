import scala.util.Random

val x: Int = Random.nextInt(5)
// checking a value against a pattern
x match {
  case 0 => "zero"
  case _ => "other"
} // "other"
// Function using Pattern matching
def matchTest(x: Int): String = x match {
  case 0 => "zero"
  case _ => "other"
}
matchTest(0)  // zero
matchTest(1)  // other

// Case classes are especially useful for pattern matching
abstract class Notification
case class Email(sdr: String, ttl: String, body: String) extends Notification
case class SMS(num: String, msg: String) extends Notification
case class VoiceRec(nm: String, link: String) extends Notification

def showNtf(ntf: Notification): String = ntf match {
  case Email(s, t, _) =>
    s"You got email from $s, title: $t"
  case SMS(n, m) =>
    s"You got sms from $n! Message: $m"
  case VoiceRec(n, l) =>
    s"You got VR from $n! Link to hear it: $l"
}

val mail = Email("Andrey", "New Salary", "Buy a new boots!")
val sms = SMS("12345", "Are you there?")
val vRec = VoiceRec("Tom", "vrec.org/id/123")

println(showNtf(mail)) // You got email from Andrey, title: New Salary
println(showNtf(sms)) // You got sms from 12345! Message: Are you there?
println(showNtf(vRec)) // You got VR from Tom! Link to hear it: vrec.org/id/123

