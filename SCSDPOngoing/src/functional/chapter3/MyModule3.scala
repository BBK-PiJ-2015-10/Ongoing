package functional.chapter3

object MyModule3 {
  
  def main (args: Array[String]): Unit = {
    
    println("Welcome to Chapter 3")
    
    println(List1.sum(List1 (2,3,6)))
    
     println(List1.product(List1 (2,3,6)))
     
     println(List1.sum2(List1 (2,3,6)))
    
     println(List1.product2(List1 (2,3,6)))
    
    
  }
  
  sealed trait List1[+A]

  case object Nil1 extends List1[Nothing]

  case class Cons1[+A](head: A, tail:List1[A]) extends List1[A] 
  
  
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
    
    def foldRight[A,B](as: List1[A], z: B)(f: (A,B) => B): B =
      as match {
        case Nil1 => z
        case Cons1(x,xs) => f(x,foldRight(xs,z)(f))
    }
    
    def sum2(ns: List1[Int]) = 
      foldRight(ns,0)((x,y)=>x+y)
      
    def product2(ns: List1[Int]) =
      foldRight(ns,1)((x,y)=>x*y)
      
      
  }
  
  
}