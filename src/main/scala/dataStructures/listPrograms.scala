package dataStructures

object listPrograms {

  def main(args: Array[String]): Unit = {

    val marks = List(70, 85, 60, 50, 90, 95)
    var sum = 0
    for (mark <- marks) {
      sum += mark //sum = sum + mark
    }
    println("sum of list elements : " + sum)


    val marks1 = List(70, 85, 60, 50, 90, 95)
    var even = 0
    var odd = 0
    for (mark <- marks1) {
      if (mark % 2 == 0) even += mark else odd += mark
    }
    println(s"even : ${even} , odd : ${odd}")


    val marks2 = List(10, 85, 60, 50, 90, 95)
    var max = marks2.head //10
    for (mark <- marks2) {
      if (mark > max) {
        max = mark
      }
    }
    println(max)

    var min = marks2.head
    for (mark <- marks2) {
      if (mark < min) {
        min = mark
      }
    }
    println(min)

    // Reversing a given List
    for (i <- marks2.length - 1 to 0 by -1) {
      print(marks(i) + " ")
    }
    println()
    // Finding duplicate from given array
    val arr = List(70, 85, 60, 50, 90, 95, 70)
    //    val duplicates = arr.diff(arr.distinct)
    //    println("Duplicates: " + duplicates)

    val dupArr = List.empty[Int] // val l1: List[Int] = List()
    val uniqueArr = Nil
    for (i <- 0 until arr.length) {
      for (j <- i + 1 until arr.length) {
        if (arr(i) == arr(j)) println("Duplicate : " + arr(i))
      }
    }
  }
}
