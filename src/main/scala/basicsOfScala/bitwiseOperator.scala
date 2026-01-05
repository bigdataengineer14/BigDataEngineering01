package basicsOfScala

object bitwiseOperator {

  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20

    println("a & b = " + (a & b))
    println("a | b = " + (a | b))
    println("a ^ b = " + (a ^ b))

    // swapping two numbers
    a = a ^ b
    b = a ^ b
    a = a ^ b

    println(a + " " + b)

}

}
