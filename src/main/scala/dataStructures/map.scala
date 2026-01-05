package dataStructures

import scala.collection.mutable
import scala.collection.immutable.ListMap

object map {

  def main(args: Array[String]): Unit = {

//   Immutable Map (Default)
    val cityPin = Map("Delhi" -> 101, "Mumbai" -> 401, "Chennai" -> 601, "Pune"->101)
    println(System.identityHashCode(cityPin))

    val updatedCityPin=cityPin+("GandhiNagar" ->111)
    println(System.identityHashCode(updatedCityPin))
    println(updatedCityPin)
    val updatedCityPin1 = cityPin - "Mumbai"
    println(System.identityHashCode(updatedCityPin1))

    val map1 = Map("Amit" -> 85, "Rahul" -> 90)
    println(System.identityHashCode(map1))
    val map2 = Map("Neha" -> 95, "Priya" -> 88) // Merge two maps into a new one
    println(System.identityHashCode(map2))
    val  mergedMap =map1 ++ map2
    println(mergedMap)
    println(System.identityHashCode(mergedMap))

//    import scala.collection.mutable._
//    Mutable Map from scala mutable collection
    val marks= mutable.Map("Rahul" -> 85, "Priya" -> 90, "Sita" ->95)
    println(System.identityHashCode(marks))
    marks+=("Naina"->99)
    println(System.identityHashCode(marks))
    println(marks)
    println(marks("Priya"))
    println(marks.get("Priyanka"))
    println(marks.getOrElse("Sita", "Not Found"))

    val cityPin1 = mutable.Map("Delhi" -> 101)
    println(cityPin1, System.identityHashCode(marks))
    cityPin1 -= "Delhi"
    println(cityPin1, System.identityHashCode(marks))

    // Use -= to remove an entry.
    val marks1 = mutable.Map("Rahul" -> 85, "Priya" -> 90)
    marks1 -= "Rahul"
    println(marks1)

    val marks2 = mutable.Map("Rahul" -> 85, "Priya" -> 92)
    println(marks2.contains("Rahul"))
    println(marks2.contains("Sita"))
    val students = Map("Amit" -> 85, "Rahul" -> 90, "Amit" -> 95)
    println(students.values.exists(_ == 90))

    val newMap1 = mutable.Map("Amit" -> 85, "Rahul" -> 90)
    println(newMap1, System.identityHashCode(newMap1))
    val newMap2 = mutable.Map("Neha" -> 95, "Priya" -> 88)
    println(newMap2, System.identityHashCode(newMap2))
    // Merge map2 into map1 (map1 gets updated)
    newMap1 ++= newMap2
    println(newMap1, System.identityHashCode(newMap1))

    val newStudents = Map("Amit" -> 85, "Rahul" -> 90, "Neha" -> 95)
    val studentList = newStudents.toList
    println(studentList) // Output: List((Amit,85), (Rahul,90), (Neha,95))
    // toArray
    val studentArray = newStudents.toArray
    println(studentArray.mkString(", "))

    for(ns<- newStudents){
      print(ns +" ")
    }
     println()
    for((name, marks)<- newStudents){
      print(s"$name -> $marks ")
    }
  println("\n")

    for(k<- newStudents.keys){
      print(k +" ")
    }

    println("\n")

    for(v<- newStudents.values){
      print(v +" ")
    }
    val entries=newStudents.toList
    println("\n" + entries)

    for( i <- 0 until entries.length){
      val (name, marks)=entries(i)
      println(s"$name -> $marks")

    }

    val l1=List(70, 80, 85, 90, 70, 60) // identity x =>x

    val duplicates=l1.groupBy(identity).filter(x=>x._2.size>1).keys
    println(duplicates)

    println(l1.groupBy(x=>x%2==0))  // Map[K, List(V)], (60, List(60))

    val result=l1.groupBy(x=>x%2==0)

    println("even : " + result.getOrElse(true, Nil))
    println("odd : " + result.getOrElse(false, Nil))


    val grades = Map("Amit" -> 85, "Rahul" -> 90, "Neha" -> 95)
    val topper=grades.maxBy(x=>x._2)
    println(topper)

    //Word count
    val lines=List("big data big volume data lake data warehouse")
    val words=lines.flatMap(x=>x.split(" "))
    println(words)
    val wordPairs=words.map(x=>(x,1))  // big => (big,1)
    println(wordPairs)
    val grouped=wordPairs.groupBy(x=>x._1) // Map[K, List(V)]
    println(grouped)
    val wordCount=grouped.map{
      case (k,v) => (k, v.map(x=>x._2).sum)  // 1+1
    }
    println(wordCount)

   }

}
