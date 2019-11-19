
// anonymous function (i.e. no name)
(x: Int) => x + 1

// name functions
val addOne = (x: Int) => x + 1
println(addOne(1)) // 2

//methods
def multipleTree(x: Int): Int = x * 3

// multiple parameters
val add = (x: Int, y: Int) => x + y
println(add(1, 2)) // 3

//no parameters
val getTheAnswer = () => 42
println(getTheAnswer()) // 42

// default parameter values
def log(message: String, level: String = "INFO"): Unit =
  println(s"$level: $message")
// prints INFO: System starting
log("System starting")
// prints WARNING: User not found
log("User not found", "WARNING")

