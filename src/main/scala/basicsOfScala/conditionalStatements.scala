package basicsOfScala
import scala.io.StdIn

object conditionalStatements {

  def main(args:Array[String]): Unit = {
    val age = 15
    if (age >= 18) {
      println("You can vote")
    }
    else {
      println("You cannot vote")
    }
    val a1 = 10
    val b1 = 20
    val c1 = 30

    if (a1 > b1 && a1 > c1) {
      println("a1 is the largest")
    }
    else if (b1 > a1 || b1 > c1)
    {   println("b1 is the largest")
    }
    else
    {   println("c1 is the largest")
    }

    if (a1 < b1 ) {
       if(a1<c1){
        println("a1 is the largest")
        }
        println("a1 is the largest")
    }
    else if (b1 > a1 || b1 > c1)
    {   println("b1 is the largest")
    }
    else
    {   println("c1 is the largest")
    }
    println("c2 is the largest")
    ////////////////////////////////////////////////////////////////////////////////

    println("Enter first numbers :  ")
    val x1=StdIn.readInt()

    println("Enter second numbers :  ")
    val x2=StdIn.readInt()

    println(x1+x2)
    // For joining two string we can use + operator (concatenation)

    print("Enter desire environment: ")
    val env=StdIn.readLine().toLowerCase()
    env match{
      case "qa" => println(s"Logged in to $env environment")
      case "dev" => println(s"Logged in to  $env environment")
      case "uat" => println(s"Logged in to  $env environment")
      case "staging" => println(s"Logged in to  $env environment")
      case _ => println(s"Logged in to  $env environment")



    }

 }
}
