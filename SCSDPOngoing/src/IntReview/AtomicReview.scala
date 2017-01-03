package IntReview

import util.Random

object AtomicReview extends App {
  
  
  /*
  if (1  > 0) {
    println("It is true")
  }
  
  
  val x: Boolean = { 1 > 0}
  
  if (x){
    println("It is true")
  }
  
  val y: Boolean = false
  
  if (y) {
    println("OMG")
  }
  
  val kg =72.57
  val heightM = 1.727
  
  val bmi = kg/(heightM * heightM)
  
  if (bmi < 18.5) {
    println("Underweight")
  } else if (bmi < 25) {
    println("Normal weight")
  } else {
    println("Overweight")
  }
  
  val c = {
    val a =11;
    a+42
  }
  
  println(c)
  
  def multiplyByTwo(x:Int):Int = {
    x*2
  }
  
  println(multiplyByTwo(5))
  
  def addMultiply(x:Int,y:Double,s:String) = {
    println(s)
    (x+y) * 2.1
  }
  
  println(addMultiply(2,3.32,"I am practicing"))
  
  class Giraffe
  
  class Bear
  
  class Hippo
  
  val g1 = new Giraffe
  val b2 = new Bear
  
  println(g1)
  
  class Dog {
    
    def bark():String = { "yip"}
    
  }
  
  val dog = new Dog
  println(dog.bark())
  
  val r = new Random
  println(r.nextInt())
  
  

  class Cup {
    
    var percentFull = 50
    
  }
  
  val cup = new Cup
  println(cup.percentFull)
  
  cup.percentFull = 100
  
  println(cup.percentFull)
  
  var result = ""
  for (i <- 0 to 9 ) {
    result += i + ""
  }
  println(result)
  
 
  
  val v1 = Vector(1,3,5,7,9)
  println(v1)
  
  println(v1(4))
  
  println(v1.reverse)
    
  val v5 = Vector("yasser","alejandro","alberto","palacios","otero")
  
  for (word <- v5 ){
    println(word)
  }
  
  */
  
  
  def matchColor(color:String):String = {
    color match {
      case "red" => "RED"
      case "blue" => "BLUE"
      case "green" => "GREEN"
      case _ => "UNKNOWN" 
    }
  }
  
  println(matchColor("red"))
  
  class ClassArg(val entry:Int) {
    
  }
  
  val ca = new ClassArg(5)
  
  //Left on page 148
  
  
  
}