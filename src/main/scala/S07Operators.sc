// In Scala operators are methods
(10 + 1, 10.+(1))  // (11,11)

// We can define our own operators!
case class Vec(x: Double, y: Double) {
  def +(that: Vec) = Vec(this.x + that.x, this.y + that.y)
  def -(that: Vec) = Vec(this.x - that.x, this.y - that.y)
}

val (vec1, vec2) = (Vec(1.0, 1.0), Vec(2.0, 2.0))

val vec3 = vec1 + vec2
(vec3.x, vec3.y)  // (3.0, 3.0)

val vec4 = vec1.-(vec2)
(vec4.x, vec4.y)  // (-1.0, -1.0)

case class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  def negate: MyBool = MyBool(!x)
}

val t = MyBool(true)
val f = MyBool(false)
println(t and f)
println(t or f)
println(t and f.negate)
