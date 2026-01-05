package dataStructures

object list {

 def main(args:Array[String]): Unit = {

//    val list1 = List(1, 2, 3, 4, 5)
//  //  println(list1) // Output:  List(1, 2, 3, 4, 5)
//
//    val fruits = List("Mango", "Apple", "Banana", "Guava")
//    val firstFruit = fruits(3)   //fruits.head
//    println(firstFruit)
//
//    val filledList = List.fill(5)("Scala")
//    println(filledList)
//    // Creating a List with tabulate
//    val tabulatedList = List.tabulate(7)(n => n * n)
//    println(tabulatedList)

    val myList = List(10, 20, 30, 40)
//    println(myList.head) // 10
//    println(myList.tail) // List(20, 30, 40)
//    println(myList.last) // 40
//    // Using (index)
//    println(myList(2))
//
//    val newList = 5 :: myList  // or +:
//    println(newList)
//
//    val joinedList= list1:::myList
//    val conCatenatedList= list1++myList
//    println(joinedList)
//    println(conCatenatedList)
//
//    val appendedList = myList :+ 50
//    println(appendedList) // List(10, 20, 30, 40, 50)
//    val prependedList = 5 +: myList
//    println(prependedList)

    // val myList = List(10, 20, 30, 40)

    println(myList.drop(2))
    println(myList.dropRight(2))
    println(myList.dropWhile(x=>x < 30))

    println("................................")

    println(myList.take(2))
    println(myList.takeRight(2))
    println(myList.takeWhile(x=>x < 30))

    // Using filter
    println(myList.filter(el=>el > 20)) // List(30, 40)
    // Using distinct (Removing Duplicates)
    val dupList = List(1, 2, 2, 3, 4, 4, 5)
    println(dupList.distinct) // List(1, 2, 3, 4, 5)

    // Transformations :  Using map
    println(myList.map(x=>x * 2)) // List(20, 40, 60, 80)
    // Using flatMap
    val listOfLists = Array(Array(1, 2), Array(3, 4))
      println(listOfLists.flatMap(x => x).mkString(","))
//    // Using zip
    val names = List("Alice", "Bob", "John")
    val ages = List(25, 30)
    println(names.zip(ages))

    println(myList.sum) // 100
    println(myList.max) // 40
    println(myList.min) // 10

  //  val myList = List(10, 20, 30, 40)

    println(myList.reduce((x,y)=>(x+y))) // 100
    println(myList.foldLeft(0)((x,y)=>(x+y)) )// 100
   // println(List.empty[Int].reduce((x,y)=>x+y))
    println(List.empty[Int].foldLeft(1)((x,y)=>x+y))
    // Using groupBy
    val numbers = List(1, 2, 3, 4, 5, 6)
    println(numbers.groupBy(x=>x % 2))

    val unordered = List(3, 1, 4, 5, 2)
    println(unordered.sorted.reverse)

 }

}
