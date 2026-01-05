package basicsOfScala

object typeConversion {
  def main(args:Array[String]): Unit = {
    val x: String = "10"
    println(x.getClass)
    val x1 = x.toInt
    println(x1.getClass)
    val x2 = x.toLong
    println(x2.getClass)
    val x3 = x.toDouble
    println(x3.getClass)

    val n: Int = 10
    println(n.toString.getClass)

  }

}
