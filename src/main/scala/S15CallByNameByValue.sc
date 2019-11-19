// Call by Value calculate one time it runs
def test(): Int = {
  println("test")
  1
}

def f1(x: Int): Unit = {
  println(s"1st: x=$x")
  println(s"2nd: x=$x")
}

f1(test())

// Call by Value calculate each time it runs
def f2(x: => Int): Unit = {
  println(s"1st: x=$x")
  println(s"2nd: x=$x")
}

f2(test())
