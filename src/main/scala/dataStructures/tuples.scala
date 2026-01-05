package dataStructures

object tuples {
  def main(args:Array[String]): Unit = {
   // MAX 22 ELEMENTS TUPLE CAN BE CREATED
    val t = (10, "Hello", 3.5, 1,2, 3,4,5, 1,2, 3,4,5, 1,2, 3,4,5, 1,2, 3,4)
    println(t)
    val person = ("Raj", 28, "Bangalore", true)
    val name = person._1  // Access first element
    val age = person._2   // Access second element
    val city = person._3  // Access third element
    println(s"Name: $name, Age: $age, City: $city")

    println(person.productElement(0))
    println(person.productElement(1))
    println(person.productElement(2))
    println(person.productElement(3))

    //PATTERN MATCHING directly mapping tuple values with variables.
    // It will match the variables correctly with available values
    val (a, b, c) = (100, "Data Engineering", 45.6)
    println(a) // Output: 100
    println(b) // Output: Data Engineering
    println(c) //

    val arr =Array("Big Data", 2025, 99.99)
    arr.foreach(println)

    val tuple = ("Big Data", 2025, 99.99)
    tuple.productIterator.foreach(println)

    for(x<-tuple.productIterator){
      println(x)
    }

    // Swapping tuple with two elements
    val tuple01 = (1, "Scala")
    println(tuple01.swap) // Output: (Scala,1)

     val tuple02 = (1, "Big Data", 2.5)
      //productArity (Returns Tuple Size)
    println(tuple02.productArity) // Output: 3
    val tuple3 = ("AWS", "Spark", "Scala")
    println(tuple3.productElement(1))

    val tuple03= (100, "Scala", 55.5)
    println(tuple03.toString) // Output: (100,Scala,55.5)

    //canEqual (Tuple Type Compatibility Check)
    //Checks if both tuples are equal or not (number of elements in both tuple)
    val tuple4 = Tuple3(10, "Spark", 3)
    println(tuple4.canEqual(Tuple3(1, "Scala", true))) // Output: true
    println(tuple4.canEqual((1, 2.5))) // Output: false

    //Converting Tuple to List using productIterator.
    val tuple5 = (1, "Scala", 3.14)
    val list = tuple5.productIterator.toList
    println(list)

    val t1 = (1, "Scala")
    val t2 = ("AWS", 2.5)
    val merged = t1.productIterator.toList ++ t2.productIterator.toList
    println(merged)

    //Using Tuples in Functions, can return multiple values from a function using tuple

    def getDetails(): (String, Int, Boolean) = {
      ("Data Engineering", 2024, true)
    }

    val result = getDetails()
    println(result._1) // Output: Data Engineering
    println(result._2) // Output: 2024
    println(result._3)

     }

}
