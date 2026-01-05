package basicsOfScala

object variableAndOperator02 {

  def main(args: Array[String]): Unit = {
    println("My THIRD program")

    println("My FIRST program")

    println("My SECOND program")

    val a = 10
    val name = "Naina"
    val salary = 50000.00
    val isActive = true

    var a1 = 10
    println(a1)

    a1 = 20
    a1 = 30
    println(a1)
    var name1 = "Naina"
    var salary1 = 50000.00
    var isActive1 = true

    val a2 = 20
    var n: String = " "
    val c2: Char = ' '
    val f2: Float = 50.00f
    val f3: Double = 50.00
    val b1: Boolean = false

    def show(): Unit = {
      println("Hello")
      println("Hello")
      println("Hello")

    }

    val x = show()
    println(x)

    var y: Any = "Soumya"
    y = true
    y = 12345

    //Comparision operators ==, <=, >=, <,> !=

    val m1 = 10
    val m2 = 20

    println(m1 == m2)
    println(m1 != m2)
    println(m1 < m2)
    println(m1 > m2)
    println(m1 >= m2)
    println(m1 <= m2)

    //Logical Operators &&, ||, !

    val n1:Int = 10
    val n2 = 20
    val n3: Int = 30

    println((n1 > n2) && (n3 < n2))
    println((n1 < n2) && (n3 > n2))
    println((n1 > n2) || (n3 < n2))
    println(!((n1 > n2) || (n3 < n2)))

    println(n1 + n2)
    println(n1 - n2)
    println(n1 * n2)
    println(n1 / n2) // quotient
    println(n2 % n1) // num < deno == num, num > deno=reminder
  }
}

