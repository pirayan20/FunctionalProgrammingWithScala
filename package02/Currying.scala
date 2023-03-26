package package02

object Currying {
  def add(x: Int, y: Int) : Int = {
    x + y
  }

  // accept only one argument and return a function
  def addCurry(x:Int) : Int => Int = {
    (y: Int) => x + y
  }

  // short-hand for currying
  def addCurryShort(x: Int)(y: Int) : Int = x + y

  def main(args : Array[String]) : Unit = {
    println(addCurry(3)(5))

    val sum20 = addCurry(20)    // partial execution
    println(sum20(7))
    println(addCurryShort(3)(5))
    val sum30 = addCurryShort(30)_   // partial execution
  }

}
