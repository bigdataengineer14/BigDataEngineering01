package dataStructures

import scala.collection.mutable
import scala.collection.mutable.LinkedHashSet

object set {

  def main(args:Array[String]): Unit = {
    val unique = Set(10, 20, 50, 30, 10, 40, 50)
    println(unique)
    //unique+60
    println(unique)
    println(System.identityHashCode(unique))
    val cities = Set("Delhi", "Mumbai", "Chennai", "Kolkata", "Delhi")
    println(cities)

    val currentCities = Set("Delhi", "Mumbai", "Chennai")
    val updatedCities = currentCities - "Mumbai"
    val up=updatedCities + "Pune"
    println(up) // Output: Set(Delhi, Chennai)
    println(cities)

    import scala.collection.mutable.Set
    val fruits = mutable.Set("Mango", "Apple", "Banana")
    println(System.identityHashCode(fruits))
    fruits += "Guava" // Adds an element
    println(System.identityHashCode(fruits))

    val city = mutable.Set("Delhi", "Mumbai")
    city += "Kolkata"
    println(city)
    city-="Delhi"
    println(city)

    val set1 = Set("Hadoop", "Spark")
    val set2 = Set("Kafka", "Flink","Spark", "Hadoop")
    val allTools = set1 ++ set2  // same as union
    println(allTools)
    val allTools1 = set1.union(set2) // union same like union in Mysql returns unique elements
    println(allTools1)

    val subset=set1.subsetOf(set2)  // checking subset in given large set
    println(subset)
    println(set2.contains("Flink"))

    val diffTools = set1 -- set2  // same as diff
    println(diffTools)
    val diffTools1 = set1.diff(set2)  //Left anti join
    println(diffTools1)

    val commonTools = set1 & set2  //same as intersect=inner join
    println(commonTools)
    val commonTools1 = set1.intersect(set2)  //inner join
    println(commonTools1)

    import scala.collection.mutable
    val cities1 = mutable.Set("Delhi", "Mumbai", "Chennai", "Kolkata")
    cities1 --= mutable.Set("Mumbai", "Chennai") // Modifies the original set
    println(cities1)
    cities1 ++= mutable.Set("Mumbai", "Chennai") // Modifies the original set
    println(cities1)

    val cities2 = mutable.Set("Delhi", "Mumbai", "Chennai", "Darjeeling")
    val filteredCities = cities2.filter(el=>el.startsWith("D"))
    println(filteredCities) // Output: Set(Delhi, Darjeeling)

    val numbers = mutable.Set(10, 15, 20, 25, 30)
    val evenNumbers = numbers.filter(e=>e % 3 == 0)
    println(evenNumbers)

    val cities3 = mutable.Set("Delhi", "Mumbai", "Chennai")
    val upperCaseCities = cities3.map(e=>e.toUpperCase)
    println(upperCaseCities) // Output: Set(DELHI, MUMBAI, CHENNAI)

    val numbers2 = mutable.Set(1, 2, 3, 4, 5)
    val doubledNumbers = numbers2.map(x=>x * 2)
    println(doubledNumbers)

    // Convert Set to List (toList)
    val cities4 = mutable.Set("Delhi", "Mumbai", "Chennai")
    val cityList = cities4.toList
    println(cityList) // Output: List(Delhi, Mumbai, Chennai) (Order may vary)

    // Convert Set to Array (toArray)
    val numbers3 = mutable.Set(10, 20, 30)
    val numArray = numbers3.toArray
    println(numArray.mkString(", "))

    import scala.collection.immutable.BitSet
    val bs=BitSet(1,2,3)
    val bs1=mutable.BitSet(3,4,5)
    println(bs)
    println(bs.union(bs1))
    println(bs.intersect(bs1))
    println(bs.diff(bs1))
    println(bs union bs1)

    val s1:String="Madam"  // Array(M, a, d,a,m)
    val s2:String="Madam"
    println(s1 == s2)
    println(s1.equals(s2)) // content comparision
    println(s1.eq(s2))
    println(System.identityHashCode(s1), System.identityHashCode(s2))

    for (i<- s1){
      print(i +" ")
    }
  println()
    for (i<- 0 until s1.length){
      print(s1(i) +" ")
    }

   val s3=new String("Madam")
    val s4=new String("Madam")
    println(s3.equals(s4))  // ==, equals, eq
    println(s3.eq(s4))
   println(System.identityHashCode(s3), System.identityHashCode(s4))










  }
}
