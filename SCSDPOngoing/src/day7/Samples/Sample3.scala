package day7.Samples

trait LinkedList5[A <: Number] {
  
// Super type version A >: Int
  
  /*
  def abstraction[B] (end:A, f:(A,B) => B) : B = 
    this match {
    case End5() => end
    case Pair5(hd,tl) => f(hd,tl.abstraction(end,f)
  }
  */
  
  
  
  
}

case class End5[A <: Number]() extends LinkedList5[A]

case class Pair5[A <:Number](head:A, tail:LinkedList[A]) extends LinkedList5[A]





object Sample3 extends App {
  
}