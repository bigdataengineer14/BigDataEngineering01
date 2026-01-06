package dataStructures

object arrays3 {
  def main(args:Array[String]): Unit = {

    val numbers:Array[Int] = Array(5, 10, 15, 20, 25,100)
    val firstNum = numbers(0)
    println(firstNum)  // Output: 5
    numbers(1)=200    //Arrays are mutable

    println(numbers.mkString(", "))

     val names:Array[String] = Array("Riya", "Jiya", "Siya")
    println(names(1))
    // Using new Array[]
//    val arr=new Array[Int](3)
//    arr(0)=12
//    arr(1)=14
//    arr(2)=16
//    arr(3)=20

    val numbers1 = Array(5, 10, 15, 20, 25) // length =5, index (0, 4th)
    for (i <- 0 until numbers1.length) {
      println(numbers1(i))
    }

      for (num <- numbers1) {
        print(num+" ")
      }

    print("\n")
    println("Length: " + numbers1.length) //Output: Length: 5
    // Head - Get the first element
    println("Head: " + numbers1.head)  //Output: Head: 5
    // Tail - Get all elements except the first
    println("To String conversion: " + numbers1.mkString(", ")) //Output: Tail: 10, 2, 3, 7
    println("Tail: " + numbers1.tail.mkString(", "))

    println("Last: " + numbers1.last) //Output: Last: 7
    // Reverse - Reverse the array order
    println(s"Reversing array elements: ${ numbers1.reverse.mkString(", ")}")
    //Output: Reverse: 7, 3, 2, 10, 5
//    // Check if array contains a specific value

    val arr = Array(5, 10, 2, 3, 7)

    println("Contains 20: " + arr.contains(20))  //Output: Contains 20: false
    println("Contains 10: " + arr.contains(10))  //Output: Contains 10: true
    // Convert array to list
    val list = arr.toList
    println("Converted to List: " + list)  //Output: Converted to List: List(5, 10, 2, 3, 7)
//    // Sorted - Sort the array in ascending order
  println("Sorted: " + arr.sorted.mkString(", "))  //Output:Sorted: 2, 3, 5, 7, 10
  val arr1=arr.sorted
    println(arr1.reverse.mkString(", "))

  }

}
