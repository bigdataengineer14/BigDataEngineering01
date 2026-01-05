package basicsOfScala

import scala.io.StdIn

object loops {

  def main(args: Array[String]): Unit = {

    val days = List("Monday", "Tuesday", "Wednesday")

    for (day <- days) {
      println(s"processing logs for $day")
    }

    for (i <- 1 to 10) {
      println(i) //1,2, 3,4,5,.....10
    }

    for (i <- 1 until 5) {
      println(i) //1,2, 3,4,5,.....10
    }


    for (i <- 1 to 11 by 2) {
      println(i) //1,2, 3,4,5,.....10
    }

// sum of first 10 natural numbers
    var sum = 0
    for (i <- 1 to 10) {
      sum += i //sum=sum+i
    }
    println(sum)

  // sum of odd numbers till 11
    var sum1 = 0
    for (i <- 1 to 11 by 2) {
      sum1 += i //sum=sum+i
    }
    println(sum1)
// sum of even numbers till 11
    var sum2 = 0
    for (i <- 0 to 11 by 2) {
      sum2 += i //sum=sum+i
    }
    println(sum2)

// sum of even numbers using if logic
    var sum3 = 0
    for (i <- 0 to 11) {
      if (i % 2 == 0)
        sum3 += i //sum=sum+i
    }
    println(sum3)

  //Nested for loop

    for (i <- 1 to 3) {
      for (j <- 1 to 2) {
        println(s"i=$i , j=$j")
      }
    }

    // Two sum problem Important one

   val numbers = List(10, 90, 80, 70, 60, 40, 20, 10)
    val target = 100
    for (i <- 0 until numbers.length) {

      for (j <- i + 1 until numbers.length) {
        if (numbers(i) + numbers(j) == target) {
          println(s"${numbers(i)}, ${numbers(j)}")
        }

      }

    }
// While loop
    var k = 0
    while (k < 3) {
      println(k)
      k += 1
    }

  // Login attempt by user
    var success = false

    while (!success) {
      print("enter your password : ")
      val password = StdIn.readLine().toLowerCase()
      if (password == "admin") {
        println("Login successful")
        success = true
      }
      else {
        println("wrong password entered, try again")
      }

    }

    var z = 5
    do {
      println(s"Retrying the connection $z")
      z += 1
    } while (z < 3)

    val correctPin = "1234"
    var result = false

    do {
      if (StdIn.readLine("Enter ATM Pin ") == correctPin) {
        println("Go ahead with withdrawal")
        result = true
      } else println("wrong pin")
    } while (!result)

  }

}
