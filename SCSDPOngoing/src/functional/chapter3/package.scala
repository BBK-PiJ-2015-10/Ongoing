package functional.chapter3

  object Tonto {

  def main(args: Array[String]): Unit = {
    
      println("Welcome to chapter 2")
      
      //println(factorial(3))
      
      //println(findFirst( Array(7,9,13),(x: Int) => x ==9 ))
      
  }

  sealed trait List1[+A]

  case object Nil1 extends List1[Nothing]

  case class Cons1[+A](head: A, tail:List1[A]) extends List1[A] 
  
  //List1 (1,2,3)
  
  //val ale = Cons1(1,2,3)

  object List1 {
  
    def sum(ints: List1[Int]): Int = ints match {
      case Nil1 => 0
      case Cons1(x,xs) => x + sum(xs)
    }
    
    def apply[A](as: A*): List1[A] =
      if (as.isEmpty) Nil1
      else Cons1(as.head, apply(as.tail: _*))
    
    def product(ds: List1[Double]): Double = ds match {
        case Nil1 => 1.0
        case Cons1(x,xs) => x * product(xs) 
    }
     
}

    //object Driver extends App {
  
      //println("Welcome to Chapter 3")
      
      //List1 (1,2,3)
      
      //println(List1.sum(List1 (1,2,3))
      
  //}
    
}