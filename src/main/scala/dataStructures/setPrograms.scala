package dataStructures

object setPrograms {

  def main(args: Array[String]): Unit = {

    val marks = Set(70, 85, 60, 50, 90, 95)
    var sum = 0
    for (mark <- marks) {
      sum += mark //sum = sum + mark
    }
    println("sum of set elements : " + sum)

    val marks1 = Set(70, 85, 60, 50, 90, 95)
    var even = 0
    var odd = 0
    for (mark <- marks1) {
      if (mark % 2 == 0) even += mark else odd += mark
    }
    println(s"even : ${even} , odd : ${odd}")


    val marks2 = Set(10, 85, 60, 50, 90, 95)
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

    val marks3 = Set(10, 85, 60, 50, 90, 95).toList
    // Reversing a given List
    for (i <- marks3.length - 1 to 0 by -1) {
      print(marks3(i) + " ")
    }
    println()
    // Finding duplicate from given array

    val arr = Set(70, 85, 60, 50, 90, 95, 70)
    println(arr)
    //    val duplicates = arr.diff(arr.distinct)
    //    println("Duplicates: " + duplicates)

    val arr1 = List(70, 85, 60, 50, 90, 95, 70, 75)
    println(arr1.distinct)

    val uniqueElements =
      arr1.foldLeft(List[Int]()) { (x, y) =>
        if (x.contains(y)) x else x :+ y
      }
    println("Unique elements : " + uniqueElements)

    val duplicates = arr1.diff(arr1.distinct)
    println("Duplicate Values : " + duplicates)
    var empty = Set[Int]()
    for (a <- arr1) {
      if (empty.contains(a)) println(s"Duplicate value : $a")
      else empty += a
    }
    println(empty)
  }

}
