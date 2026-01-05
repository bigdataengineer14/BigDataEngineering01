package dataStructures

import scala.collection.mutable.ArrayBuffer

object arrays2 {
  def main(args:Array[String]): Unit = {

  val dynArr=ArrayBuffer[Int]()
    dynArr +=20
    dynArr+=10

    println(dynArr.mkString(","))

    val dynArr1=ArrayBuffer(1,2,3)
    dynArr1 +=20
    dynArr1 -=2
    println(dynArr1.mkString(","))

   val ab= Array(10, 20, 30, 40 ,50, 100)
    println(ab.map(x=>x*2).mkString(", "))
    println(ab.map(el=>if (el>20) el*2 else el).mkString(", "))
    println(ab.filter(x=>x%25==0).mkString(", "))
   // println(ab.reduce((x,y)=>(x*y)*3))

    val text="apple"
    if(text.contains("app")) println("Found")
    else println("Not found")

    val fruits=Array("apple", "banana", "orange")
    val target="banana"
    if (fruits.contains(target)) println("found")
    else println("not found")

    val marks=Array(70, 85, 60, 50, 90, 95)
    println(marks.min)
    println(marks.max)
    println(marks.reverse.mkString(","))

    var sum=0
    for(mark <- marks){
      sum+=mark      //sum = sum + mark
    }
    println("sum of array elements : ", sum)


    val marks1=Array(70, 85, 60, 50, 90, 95)
    var even=0
    var odd=0
    for(mark <- marks1){
     if(mark %2==0) even +=mark else odd+=mark
    }
    println(s"even : ${even} , odd : ${odd}")


    val marks2=Array(10, 85, 60, 50, 90, 95)
    var max=marks2(0)  //10
    for(mark<-marks2){
      if(mark>max){
        max=mark
      }
    }
   println(max)

    var min=marks2(0)
    for(mark<-marks2){
      if(mark<min){
        min=mark
      }
    }
    println(min)
// Reversing a given Array
  for (i <- marks2.length-1 to 0 by -1){
    print(marks(i)+" ")
  }
   println()
 // Finding duplicate from given array

    val arr=Array(70, 85, 60, 50, 90, 95, 70)
    val dupArr= Array[Int](arr.length)
    val uniqueArr= Array[Int](arr.length)

    for(i <- 0 until arr.length){
      for(j<- i+1 until arr.length){
        if(arr(i)==arr(j)) println("Duplicate : "+arr(i))
      }
    }


  }

}
